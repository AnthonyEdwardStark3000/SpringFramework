package com.Mr_stark.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.Mr_stark.spring.springjdbc.employee.dao.EmployeeDao;
import com.Mr_stark.spring.springjdbc.employee.dao.rowMapper.EmployeeRowMapper;
import com.Mr_stark.spring.springjdbc.employee.entity.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbctemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbctemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee  where id=?";
		int result = jdbctemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		String sql = "select * from employee where id = ?";
		Employee employee = jdbctemplate.queryForObject(sql, rowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		String sql = "SELECT * FROM EMPLOYEE";
		List<Employee> employeesName = jdbctemplate.query(sql, rowMapper);
		return employeesName;
	}

}
