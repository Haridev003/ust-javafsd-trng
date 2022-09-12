package com.ust2;

import java.io.File;
class Filename{
	public static void main(String [] args) {
		File file = new File("newFile.txt");
		try {
			boolean value = file.createNewFile();
			if(value) {
				System.out.println("The new file is created ");
			}
			else {
				System.out.println("the file already exists.");
			}
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	
	}
}