package com.ust2;



interface Employee2{
	String name ="Hari";
	int emp_id =1234;
	
	abstract float calculateSalary();
	abstract  void fetchDepartment();
	
}
 class Engineer2 implements Employee2{
	 public  float calculateSalary() {
		 return 4.5f;
	 }
	public void fetchDepartment() {
		 System.out.println("Delivery");
	 }
 }
 class Doctor2 implements Employee2{
	public float calculateSalary() {
		 return 6.5f;
	 }
	public void fetchDepartment() {
		 System.out.println("Cardiology");
	 }
 }
  class Main01{
	 public static void main(String[] args)
	 {
		 //Employee E1= new Employee();
		 Engineer2 e= new Engineer2();
		 Doctor2 d= new Doctor2();
		 System.out.println(e.name);
		 System.out.println(e.emp_id);
		 System.out.println(e.calculateSalary());
		 e.fetchDepartment();
		 System.out.println(d.name);
		 System.out.println(d.emp_id);
		 System.out.println(d.calculateSalary());
		 d.fetchDepartment();
	 }
 }
