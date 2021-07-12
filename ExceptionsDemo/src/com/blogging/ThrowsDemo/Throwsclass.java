package com.blogging.ThrowsDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throwsclass {

	static void function() throws FileNotFoundException{
		FileReader file = new FileReader("read.txt");
	     throw new ArithmeticException();
	   
	      
	    }
	  public static void main(String[] args) throws FileNotFoundException {
	    try{
	      function();
	    }catch(Exception e){
	      System.out.println("File not found");
	    }

	}

}
