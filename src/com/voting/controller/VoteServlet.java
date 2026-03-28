package com.voting.controller;

import com.voting.dao.CandidateDAO;
import com.voting.dao.UserDAO;
import com.voting.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO userDAO = new UserDAO();
    private CandidateDAO candidateDAO = new CandidateDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("user") == null) {
            response.sendRedirect("login.html?error=Please login to vote");
            return;
        }

        User user = (User) session.getAttribute("user");
        
        // Fresh check in DB just to be sure
        if (userDAO.hasUserVoted(user.getId())) {
            response.sendRedirect("dashboard.html?error=You have already voted");
            return;
        }

        String candidateIdStr = request.getParameter("candidateId");
        if (candidateIdStr != null && !candidateIdStr.isEmpty()) {
            int candidateId = Integer.parseInt(candidateIdStr);
            if (candidateDAO.incrementVote(candidateId)) {
                userDAO.markUserAsVoted(user.getId());
                user.setHasVoted(true); // update session object
                response.sendRedirect("dashboard.html?success=Vote cast successfully");
            } else {
                response.sendRedirect("dashboard.html?error=Failed to cast vote");
            }
        } else {
            response.sendRedirect("dashboard.html?error=Invalid candidate selection");
        }
    }
}
