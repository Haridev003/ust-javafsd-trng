package com.ust;
//firstName,BillOffThePatient
public class Student {
int Sid;
String name;
int age;
String course;
static int count;

//public Student () {
	//Constructor donot have return type
//}

{
	int z=7;
	System.out.println(z);
}







public static void main(String args[]) {
int x=5;
float f=12.45f;
String str;
Student s2= new Student();
Student s= new Student();  //default constructor zero argument constructor
Student s1= new Student();
s.age=22;
System.out.println(s.age);
System.out.println(x);
s.count=15;
s1.age=25;
System.out.println(s1.age);
System.out.println(s.count);
System.out.println(s1.count);

}
}
