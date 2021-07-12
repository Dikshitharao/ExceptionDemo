package com.blogging.CompileTime;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CTExceptions {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
				try {
					FileReader file = new FileReader("read.txt");//There is no file as read.txt
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
