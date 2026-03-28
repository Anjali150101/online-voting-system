package com.voting.controller;

import com.google.gson.Gson;
import com.voting.dao.CandidateDAO;
import com.voting.model.Candidate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/CandidateServlet")
public class CandidateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private CandidateDAO candidateDAO = new CandidateDAO();

    // Get all candidates as JSON
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        List<Candidate> candidates = candidateDAO.getAllCandidates();
        String json = new Gson().toJson(candidates);
        
        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
    }
    
    // Admin adds candidate
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String party = request.getParameter("party");
        String symbol = request.getParameter("symbol");

        Candidate candidate = new Candidate(0, name, party, symbol, 0);

        if (candidateDAO.addCandidate(candidate)) {
            response.sendRedirect("admin.html?success=Candidate added successfully");
        } else {
            response.sendRedirect("admin.html?error=Failed to add candidate");
        }
    }
}
