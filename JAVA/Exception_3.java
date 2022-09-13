package com.ust;
import java.io.*;

public class Exception_3 {
  public static void findFile() throws IOException{
	  File newFile = new File("C:\\Users\\ustjavafsdb221\\test.txt");
	  FileInputStream Stream = new  FileInputStream(newFile);
	  
  }
  public static void main(String [] args) {
	  try {
		  findFile();
	  }
	  catch(IOException e) {
		  System.out.println(e);
	  }
  }
}
