package com.blogging.RunTime;

public class NegativeArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
			    int a[] = new int[-5];
			    }
			    catch(NegativeArraySizeException exception){
			      System.out.println("Do not create an array with negative size");
			    }
			   
			    

	}

}
