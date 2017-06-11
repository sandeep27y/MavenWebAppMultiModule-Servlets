package com.employee.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.EmployeeServices.EmployeeService;
import org.employee.model.EmployeeDetails;
import org.employee.utill.EmployeeUtill;

/**
 * Servlet implementation class EmloyeeController
 */
public class EmloyeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmloyeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		EmployeeService employeeService = new EmployeeService();
		int employeeId;
		String firstName,lastName,gender,employeeSalary,deptnumber,deptname;
		Date birthdate,hiredate,fromdate,todate;
		switch(action){
			case "/edit":
				employeeId = Integer.parseInt(request.getParameter("id"));
				request.setAttribute("employeeId", employeeId);
				request.getRequestDispatcher("/EmployeeUpdate.jsp").forward(request, response);
				break;
			case "/EmployeeInfromation.do":
				employeeId = Integer.parseInt(request.getParameter("employeeId"));	
				EmployeeDetails employee=employeeService.getEmployeeInformation(employeeId);
				request.setAttribute("Employee", employee);
				RequestDispatcher rd = request.getRequestDispatcher("/EmployeeInformation.jsp");
				rd.forward(request, response);
				break;
			case "/update":
				employeeId = Integer.parseInt(request.getParameter("employeeId"));
				firstName = request.getParameter("firstName");
				lastName = request.getParameter("lastName");
				gender = request.getParameter("gender");
				EmployeeDetails emp = new EmployeeDetails(firstName, lastName, gender);
				boolean validation=employeeService.updateEmployeeInformation(employeeId,emp);
				if(validation){
					request.setAttribute("display", "Employee Details are updated");
				}else{
					request.setAttribute("display", "Employee Details are not updated");
				}
				RequestDispatcher rd1 = request.getRequestDispatcher("/EmployeeUpdate.jsp");
				rd1.forward(request, response);
				break;
			case "/add":
				employeeId = Integer.parseInt(request.getParameter("employeeId"));
				birthdate = EmployeeUtill.dateParsingToSQL(request.getParameter("birthdate"));
				firstName = request.getParameter("firstName");
				lastName = request.getParameter("lastName");
				gender = request.getParameter("gender");
				hiredate = EmployeeUtill.dateParsingToSQL(request.getParameter("hiredate"));
				employeeSalary = request.getParameter("salary");
				fromdate = EmployeeUtill.dateParsingToSQL(request.getParameter("fromdate"));
				todate = EmployeeUtill.dateParsingToSQL(request.getParameter("todate"));
				deptnumber = request.getParameter("deptnumber");
				deptname = request.getParameter("deptname");
				EmployeeDetails employeedetails = new EmployeeDetails(employeeId, birthdate, firstName, lastName, gender, hiredate, employeeSalary, fromdate, todate, deptnumber, deptname);
				boolean addvalidation=employeeService.addEmployeeInformation(employeedetails);
				if(addvalidation){
					request.setAttribute("display", "Employee Details are added");
				}else{
					request.setAttribute("display", "Employee Details are not added");
				}
				request.getRequestDispatcher("/LogIn.jsp").forward(request, response);
				break;
		}
			
		
	}
}
