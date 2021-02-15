package com.shehani.exceptions;
public class InvalidPriceException extends Exception{
	public InvalidPriceException(String message,Exception e) {
		super(message,e);

	}

}
