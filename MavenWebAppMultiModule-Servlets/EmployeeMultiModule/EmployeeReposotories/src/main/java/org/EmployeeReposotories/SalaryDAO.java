package org.EmployeeReposotories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.employee.model.EmployeeDetails;

public class SalaryDAO {
	PreparedStatement pStatement = null;
	Connection con = DataBaseConnection.getConnection();
	public boolean addSalaryInformation(EmployeeDetails employee) {
		ResultSet rs = null;
		boolean addSalary = false;
		try{
			pStatement = con.prepareStatement("INSERT INTO salaries(emp_no, salary, from_date, to_date) VALUES (?, ?, ?, ?)");
			pStatement.setInt(1, employee.getEmployeeNo());
			pStatement.setString(2, employee.getSalary());
			pStatement.setDate(3, employee.getFromdate());
			pStatement.setDate(4, employee.getTodate());
			int x=pStatement.executeUpdate();
			if(x>0)
				addSalary=true;
			else
				addSalary=false;
		}catch(SQLException e){
			e.printStackTrace();
		}
		return addSalary;
	}
}
