package com.blogging.ThrowDemoOne;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the age of the candidate");
		
		age = sc.nextInt();
		
		if(age<25) {
			throw new AgeNotSatisfiedException("Age has to be greater than 25 to apply to this role");
		}
		else {
			System.out.println("You can apply for the role");
		}

	}

}
