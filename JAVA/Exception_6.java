package com.ust2;
import java.io.*;

public class Exception_6 {
	public static void main(String [] args) {
		String line;
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ustjavafsdb221\\test.txt")))
		{
			while((line=br.readLine())!= null) {
				System.out.println("Line=>"+line);
			}
		}
		catch(IOException e) {
			System.out.println("Io Exception in  try block=>"+e.getMessage());
		}
	}

}
