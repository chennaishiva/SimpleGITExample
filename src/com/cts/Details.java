package com.cts;

import org.tcs.*;


//child class
public class Details {
	
	public void age() {
		System.out.println("Age is 27");
	}
	
	public static void main(String[] args) {
		Details d = new Details();
		d.age();
		
		Company c = new Company();
		c.cmpId();
		c.cmpName();
		
		Employee e = new Employee();
		e.empId();
		e.empName();
		
	}

}
