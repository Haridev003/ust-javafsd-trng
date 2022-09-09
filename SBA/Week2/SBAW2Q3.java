package com.ust2;

import java.util.ArrayList;
import java.util.Scanner;

class EmployeeList{
	public static void main(String args[]) {
	ArrayList<String> listName = new ArrayList<String> ();
	/***Scanner sc = new Scanner(System.in);
	while (sc.hasNext()) {
		String i = sc.next();
		listName.add(i);
	}
	System.out.println(listName);*/
	listName.add("Leo");
	listName.add("Suaraz");
	listName.add("Ineata");
	listName.add("Xavi");
	listName.add("Buffon");
	listName.add("Stegen");
	listName.add("perdi");
	listName.add("Ramos");
	listName.add("Chilleni");
	listName.add("Puyol");
	listName.add("Zalton");
	listName.add("Gerizie");
	listName.add("Busiqustes");
	listName.add("Rshford");
	listName.add("Rooney");
	listName.add("Walker");
	listName.add("Stone");
	listName.add("Martinez");
	listName.add("Alexis");
	listName.add("Kessie");
	listName.add("Lionel Anderes Messi");
	ArrayList<Integer> listid = new ArrayList<Integer> ();
	int n = 20;
	int j=111;
	for (int i=0 ;i<n; i++) {
		listid.add(j);
		j++;
	}
	ArrayList<String> listDepartment = new ArrayList<String> ();
	listDepartment.add("Product");
	listDepartment.add("Delivary");
	listDepartment.add("Support");
	listDepartment.add("security");
	listDepartment.add("Product");
	listDepartment.add("Delivary");
	listDepartment.add("Support");
	listDepartment.add("security");
	listDepartment.add("Product");
	listDepartment.add("Delivary");
	listDepartment.add("Support");
	listDepartment.add("security");
	listDepartment.add("Product");
	listDepartment.add("Delivary");
	listDepartment.add("Support");
	listDepartment.add("security");
	listDepartment.add("Product");
	listDepartment.add("Delivary");
	listDepartment.add("Support");
	listDepartment.add("security");
	System.out.println("Names:"+listName);
	System.out.println("Id:"+listid);
	System.out.println("Department:"+listDepartment);
	
	
	}
}
