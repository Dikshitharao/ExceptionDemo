package com.blogging.ThrowDemo;

public class ThrowDemo {
	 static void function(){
	     int a = 7;
	     int b = 0;
	     int c = a/b;
	     throw new ArithmeticException();
	   
	      
	    }
	  public static void main(String[] args) {
	    try{
	      function();
	    }catch(ArithmeticException e){
	      System.out.println("Divide by 0 exception");
	    }

}
}
