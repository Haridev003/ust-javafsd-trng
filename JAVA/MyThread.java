package com.ust2;

public class MyThread extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThread mt = new MyThread("abc");
        mt.start();
	}
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		System.out.println("MyThread- START"+Thread.currentThread().getName());
       try {
    	   Thread.sleep(1000);
    	   doDBprocessing();
       }
       catch (InterruptedException e) {
    	   e.printStackTrace();
       }
       System.out.println("My thread - END"+Thread.currentThread().getName());
       
	}
	private void doDBprocessing() throws InterruptedException{
		Thread.sleep(5000);
	}
}
