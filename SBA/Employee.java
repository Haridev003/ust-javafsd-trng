package com.ust;

class EmployeeDetails{
	int emp_id =1234,salary=4;
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
 class emp1 extends EmployeeDetails{
	public void Showname() {
		System.out.println(name);
		System.out.println(emp_id);
	}
	public static void main (String args[]) {
		EmployeeDetails e = new EmployeeDetails();
		emp1 e1 = new emp1();
		e.getSalary();
		e.getSalary(1234);
		e.Showname();
		e1.Showname();
		
		
	}
}
