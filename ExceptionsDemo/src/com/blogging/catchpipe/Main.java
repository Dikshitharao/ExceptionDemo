package com.blogging.catchpipe;
import java.util.*;
import java.lang.Exception;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the size of array");
		    try{
		    int a = sc.nextInt();
		    
		    int array[] = new int[a];
		    System.out.println("Enter the element that you want to access");
		    int b = sc.nextInt();
		    System.out.println(array[b]);
		    }catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e){
		      e.printStackTrace();
		    }
		    System.out.println("After try/catch");
		
	}

}
