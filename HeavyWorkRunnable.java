package com.ust2;

public class HeavyWorkRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HeavyWorkRunnable h1 = new HeavyWorkRunnable();
        h1.run();
	}
	public void run() {
		System.out.println("Doing heavy processing- START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBprocessing();
		}
		catch(InterruptedException e) {
			System.out.println("Doing heavy processing- END"+Thread.currentThread().getName());
			
		}}
		private void doDBprocessing() throws InterruptedException{
			Thread.sleep(5000);
		}
	

}
