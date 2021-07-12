package com.blogging.RunTime;

public class ArrayOutOfIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int a[] = new int[8];
              a[0] = 1;
              a[1]=2;
              a[2]=9;
              try {
             // System.out.println(a[-3]);
              
              System.out.println(a[9]);
              }catch(ArrayIndexOutOfBoundsException e) {
            	  System.out.println("Array index out of bound");
              }
	}

}
