package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class EmployeeTest {
	private Employee myEmployee;
	
	@Before
	public void setup(){
		myEmployee = new Employee(78,"Robert","Sattely",60000);
	}
	@Test
	public void initialized_test(){
		Assert.assertEquals(78, myEmployee.getEmployeeId());
		Assert.assertEquals("Robert", myEmployee.getFirstName());
		Assert.assertEquals("Sattely", myEmployee.getLastName());
		Assert.assertEquals(60000, myEmployee.getAnnualSalary(), .01);

	}
	@Test
	public void set_new_first_name(){
		myEmployee.getFirstName();
		Assert.assertEquals("Robert", myEmployee.getFirstName());
	}
	@Test
	public void set_new_last_name(){
		myEmployee.getLastName();
		Assert.assertEquals("Sattely", myEmployee.getLastName());
		
	}
	@Test
	public void check_full_name(){
		myEmployee.getFullName();
		Assert.assertEquals("Sattely, Robert",myEmployee.getFullName());
	}
	@Test
	public void check_department_id(){
		myEmployee.setDepartment("Lab");
		Assert.assertEquals("Lab", myEmployee.getDepartment());
		
	}
	@Test
	public void raise_salary_test(){
		myEmployee.RaiseSalary(2);;
		Assert.assertEquals(61200,myEmployee.getAnnualSalary(),0.01);
	}
}
	

