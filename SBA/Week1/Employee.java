package com.ust;

class EmployeeDetails{
	int emp_id =1234,salary=4;//salary in lpa
	String name="abc",department="delivary",email;

public void getSalary()
{
	System.out.println(salary);
	}

public void getSalary(int emp_id) {
	System.out.println(emp_id);
	System.out.println(salary);
	
}
public void Showname() {
	System.out.println(name);
}
}
 class Engineer extends EmployeeDetails{
	public void Showname() {
		System.out.println(name);
		System.out.println(emp_id);
		super.Showname();
	}
	public static void main (String args[]) {
		EmployeeDetails e = new EmployeeDetails();
		Engineer e1 = new Engineer();
		e.getSalary();
		e.getSalary(1234);
		e1.Showname();
		
		
	}
}
