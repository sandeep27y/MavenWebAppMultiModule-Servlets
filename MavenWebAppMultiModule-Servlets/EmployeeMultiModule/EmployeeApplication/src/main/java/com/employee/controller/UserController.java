package com.employee.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.EmployeeServices.UserService;
import org.employee.model.UserInfo;

/**
 * Servlet implementation class UserController
 */
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserService userService = new UserService();
		String paramName=getServletConfig().getInitParameter("userName");
		String paramPassword=getServletConfig().getInitParameter("password");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String time = userService.getDateFromService();
		if(paramName.equals(name) && paramPassword.equals(password)){
			HttpSession session = request.getSession();
			UserInfo userInfo = new UserInfo(name, password,time);
			session.setAttribute("userInfo", userInfo);
			request.setAttribute("userInfo", userInfo);
			request.getRequestDispatcher("/pages/home.jsp").forward(request, response);
		}else{
			response.sendRedirect("/EmployeeApplication/pages/error.jsp");
		}
	}

}
