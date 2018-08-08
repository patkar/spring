package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class TestMyJDBC {

	public static void main(String[] args) {
		Employee emp1=new Employee(7,"bham",23);
//		Employee emp2=new Employee(8,"ram",24);
//		Employee emp3=new Employee(9,"sham",25);
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO eDao=(EmployeeDAO)c.getBean("eDAO");
	//	eDao.insertRow(emp);
		//eDao.deleteRow(emp);
		
//		ArrayList em=new ArrayList<>();
//		em.add(emp1);
//		em.add(emp2);
//		em.add(emp3);
//		eDao.insertMultipleRow(em);
		eDao.updateRow(emp1);
		
		ArrayList<Employee> al=eDao.readRows();
		for(Employee e:al)
		{
			System.out.println(e.getEmployeeId()+"   "+e.getEmployeeName()+"   "+e.getDepartmentId());
		}
	}

}
