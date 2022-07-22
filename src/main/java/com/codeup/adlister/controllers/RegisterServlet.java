package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.Users;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Users usersDao = DaoFactory.getUsersDoa();
        User userDb = usersDao.findByUsername(username);

        boolean userExist = usersDao.findByUsername(username) == null;

        if ( username.isEmpty() ||  email.isEmpty() || password.isEmpty() || userExist){
            response.sendRedirect("/register");
        } else {
            User user = new User(
                    "username",
                    "email",
                    "password"
            );
            usersDao.insert(user);
            response.sendRedirect("/login");
        }
    }
}