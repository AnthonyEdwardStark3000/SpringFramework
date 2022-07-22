package com.Mr_stark.spring.springjdbc.employee.dao.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Mr_stark.spring.springjdbc.employee.entity.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1)); //First col in employee table is the id
		emp.setFirstName(rs.getString(2)); //second col in employee table is the id
		emp.setLastName(rs.getString(3)); //second col in employee table is the id
		return emp;
	}

}
