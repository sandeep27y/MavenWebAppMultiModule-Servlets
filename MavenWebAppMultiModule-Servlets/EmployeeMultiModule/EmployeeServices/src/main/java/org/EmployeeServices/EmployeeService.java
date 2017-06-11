package org.EmployeeServices;

import org.EmployeeReposotories.EmployeeDAO;
import org.EmployeeReposotories.SalaryDAO;
import org.employee.model.EmployeeDetails;

public class EmployeeService {
	EmployeeDAO employeeDAO = new EmployeeDAO();
	SalaryDAO salaryDAO = new SalaryDAO();
		public EmployeeDetails getEmployeeInformation(int id){
			EmployeeDetails employee=employeeDAO.getEmployeeInformation(id);
			return employee;
			
		}

		public boolean updateEmployeeInformation(int employeeId,EmployeeDetails employee) {			
			 boolean validation = employeeDAO.updateEmployeeInformation(employeeId,employee);
			 return validation;
		}

		public boolean addEmployeeInformation(EmployeeDetails employee2) {
			// TODO Auto-generated method stub
			boolean EmployeeValidation = employeeDAO.addEmployeeInformation(employee2);
			boolean SalaryValidation = salaryDAO.addSalaryInformation(employee2);
			
			if(EmployeeValidation && SalaryValidation)
				return true;
			else
				return false;
		}
	}