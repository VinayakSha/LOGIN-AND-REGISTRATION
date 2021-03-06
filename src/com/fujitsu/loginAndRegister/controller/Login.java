package com.fujitsu.loginAndRegister.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fujitsu.loginAndRegister.DAO.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String username=request.getParameter("username");
		String password=request.getParameter("password");

		LoginDao dao=new LoginDao();

		if(dao.verifyUserCredentials(username, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("user",username);
			response.sendRedirect("welcome.jsp");

		}
		else {
			response.sendRedirect("Login.jsp");
		}
	}


}
