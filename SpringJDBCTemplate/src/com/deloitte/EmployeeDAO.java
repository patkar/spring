package com.deloitte;

import java.util.ArrayList;
import java.util.Iterator;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertRow(Employee emp) {
		int eid = emp.getEmployeeId();
		String ename = emp.getEmployeeName();
		int did = emp.getDepartmentId();

		String sql = "INSERT INTO EMPLOYEE VALUES(" + eid + ",'" + ename + "'," + did + ")";
		int rows = jdbcTemplate.update(sql);
		if (rows > 0)
			System.out.println("successfully inserted");
		else
			System.out.println("not inserted, problem");
	}

	public void deleteRow(Employee emp) {
		String ename = emp.getEmployeeName();
		String sql = "DELETE FROM EMPLOYEE WHERE EMPNAME='" + ename + "'";
		int rows = jdbcTemplate.update(sql);
		if (rows > 0)
			System.out.println("record deleted successfully");
		else
			System.out.println("not deleted,problem");
	}

	public void insertMultipleRow(ArrayList<?> emp1) {
		Iterator<?> it = emp1.iterator();
		while (it.hasNext()) {
			Employee emp = (Employee) it.next();
			int eid = emp.getEmployeeId();
			String ename = emp.getEmployeeName();
			int did = emp.getDepartmentId();
			String sql = "INSERT INTO EMPLOYEE VALUES(" + eid + ",'" + ename + "'," + did + ")";
			int rows = jdbcTemplate.update(sql);
			if (rows > 0)
				System.out.println("successfully inserted");
			else
				System.out.println("not inserted, problem");
		}

	}

	public void updateRow(Employee emp) {
		String ename = emp.getEmployeeName();
		int eid = emp.getEmployeeId();
		int did = emp.getDepartmentId();
		String sql = "UPDATE EMPLOYEE SET EMPNAME='" + ename + "'" + ",DEPTID=" + did + "WHERE EMPID=" + eid;
		int rows = jdbcTemplate.update(sql);
		if (rows > 0)
			System.out.println("record updated successfully");
		else
			System.out.println("not updated,problem");
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Employee> readRows()
	{
		ArrayList<Employee> al;
		String sql="select * from employee";
		al=(ArrayList<Employee>)jdbcTemplate.query(sql, new org.springframework.jdbc.core.RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rn) throws SQLException {
				int eid=rs.getInt(1);
				String ename=rs.getString(2);
				int did=rs.getInt(3);
				Employee e=new Employee();
				e.setEmployeeId(eid);
				e.setEmployeeName(ename);
				e.setDepartmentId(did);
				return e;
			}
		});
		return al;
		
	}
}
