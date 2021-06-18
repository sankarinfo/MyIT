package com.myit.general.hm;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class EmployeeP2 {
	
	private long id;    
    private String name;    
    private Date dateOfBirth;    
    private BigDecimal salary;    

    //Getter and Setters    
    // to String    
    
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
    public boolean equals(Object o) {        
        if (this == o) return true;        
        if (o == null || getClass() != o.getClass()) return false;        
        EmployeeP2 employee = (EmployeeP2) o;        
        if (id != employee.id) return false;        
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;        
        if (dateOfBirth != null ? !dateOfBirth.equals(employee.dateOfBirth) : employee.dateOfBirth != null) return false;        
        return salary != null ? salary.equals(employee.salary) : employee.salary == null;    
    }   

	@Override    
    public int hashCode() {        
        int result = (int) (id ^ (id >>> 32));      
        System.out.println("result :"+result);
        result = 31 * result + (name != null ? name.hashCode() : 0);        
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        System.out.println("result :"+result);
        return result;    
    }  
	
	
	public static void main(String[] args) {    
	    HashMap<EmployeeP2,String> employeeMap = new HashMap<EmployeeP2,String>();  
	    EmployeeP2 employee1 = new EmployeeP2();   
	    employee1.setId(1);   
	    employee1.setName("Sachin");   
	    employee1.setDateOfBirth(new Date(1987,2,1));   
	    employee1.setSalary(new BigDecimal(100000));
	    // Step 1
	    employeeMap.put(employee1,"India");   

	    for (Map.Entry<EmployeeP2, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());   
	    }
	    // Step 2
	    // Mutating the Employee Object
	    employee1.setName("Rahul");    

	    for (Map.Entry<EmployeeP2, String> employeeStringEntry : employeeMap.entrySet()) {
	        System.out.println(employeeStringEntry.getKey().hashCode());    
	    }
	    // The HashMap key is mutated and in the wrong bucket for that hashcode. 
	    // Step 3
	    System.out.println(employeeMap.get(employee1));    
	    // Returns null    

	    EmployeeP2 employee2 = new EmployeeP2();   
	    employee2.setId(1);   
	    employee2.setName("Sachin");   
	    employee2.setDateOfBirth(new Date(1987,2,1));   
	    employee2.setSalary(new BigDecimal(100000));

	    System.out.println(employeeMap.get(employee2)); 
	    // Returns null
	}
	
}