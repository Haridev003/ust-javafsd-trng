package com.ust2;

public class Thread3 extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Thread3 t3 = new Thread3();
         try {
        	 System.out.println("hi");
        	 t3.sleep(1000);
        	 System.out.println("Guys");
        	 
         }
         catch (Exception ex) {
        	 ex.getStackTrace();
         }
	}

}
