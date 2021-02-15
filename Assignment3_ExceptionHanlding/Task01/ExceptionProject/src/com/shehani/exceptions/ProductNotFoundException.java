package com.shehani.exceptions;
public class ProductNotFoundException extends Exception{
	public ProductNotFoundException(String message, Exception e) {
		super(message,e);
	}

}
