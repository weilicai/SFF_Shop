package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import model.User;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("GBK");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        UserDao userDao = new UserDao();
        User user = userDao.login(userName, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("name",userName);
            response.sendRedirect("SFF.html");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}
