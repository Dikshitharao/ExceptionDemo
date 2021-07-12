package com.blogging.ThrowDemoOne;

public class AgeNotSatisfiedException extends RuntimeException{
	public AgeNotSatisfiedException(String message) {
		super(message);
	}

}
