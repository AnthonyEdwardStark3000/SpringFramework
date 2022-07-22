package com.Mr_stark.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Mr_stark.spring.springjdbc.employee.dao.EmployeeDao;
import com.Mr_stark.spring.springjdbc.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Mr_stark/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao)context.getBean("employeeDao");
//		Employee employee = new Employee();
//		employee.setId(10);
//		employee.setFirstName("Suresh");
//		employee.setLastName("Babu");
//		int result = dao.create(employee);
		//int result = dao.update(employee);
//		int result = dao.delete(1);
//		Employee employeeResult = dao.read(10);
		List<Employee> employeeResult =  dao.read();
		System.out.println("Result is:"+employeeResult);
		//System.out.println(result+"\tNumber of rows affected.");
	}	

}
