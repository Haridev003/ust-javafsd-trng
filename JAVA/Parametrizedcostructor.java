package com.ust2;

 class this_Test{
	
	 int val1;
	 int val2;
	 this_Test(int val1,int val2){
		 this.val1=val1+val2;
		 this.val2=val1+val2;
		  }
	 void display() {
		 System.out.println("value val1="+val1+"value val2="+val2);
	 }

}
 class Main{
	 public static void main(String args[]){
		 this_Test object = new this_Test(5,10);
		 object.display();
		 
		 
	 }
 }
