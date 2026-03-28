package com.voting.controller;

import com.voting.dao.UserDAO;
import com.voting.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDAO userDAO = new UserDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String voterId = request.getParameter("voterId");
        String password = request.getParameter("password");

        User user = new User(0, name, email, voterId, password, false);

        if (userDAO.registerUser(user)) {
            response.sendRedirect("login.html?success=Registration successful. Please login.");
        } else {
            response.sendRedirect("register.html?error=Registration failed. Voter ID or Email might already exist.");
        }
    }
}
