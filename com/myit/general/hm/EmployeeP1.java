package com.myit.general.hm;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

public class EmployeeP1 {
	
	private long id;   
    private String name;   
    private Date dateOfBirth;    
    private BigDecimal salary;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeP1 [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + "]";
	}   
    
	
	public static void main(String[] args) {    
	    HashMap<EmployeeP1,String> employeeMap = new HashMap<EmployeeP1,String>();  

	    EmployeeP1 employee1 = new EmployeeP1();    
	    employee1.setId(1);    
	    employee1.setName("Sachin");    
	    employee1.setDateOfBirth(new Date(1987,2,1));    
	    employee1.setSalary(new BigDecimal(100000));    

	    employeeMap.put(employee1,"India");    

	    // Some Business logic    
	    // In the second Operation I am updating the same employee with the newly initailized Employee Object

	    EmployeeP1 employee2 = new EmployeeP1();    
	    employee2.setId(1);    
	    employee2.setName("Sachin");    
	    employee2.setDateOfBirth(new Date(1987,2,1));    
	    employee2.setSalary(new BigDecimal(100000));  

	    // Here we wanted to update the same Employee to Japan
	    employeeMap.put(employee2,"Japan");    

	    System.out.println(employeeMap); 
	    // Output of this will be 2 as below

	    /* 
	        {Employee{id=1, name='Sachin', dateOfBirth=Tue Mar 01 00:00:00 IST 3887, salary=100000}=Japan, 
	        Employee{id=1, name='Sachin', dateOfBirth=Tue Mar 01 00:00:00 IST 3887, salary=100000}=India}
	    */

	}
    
}