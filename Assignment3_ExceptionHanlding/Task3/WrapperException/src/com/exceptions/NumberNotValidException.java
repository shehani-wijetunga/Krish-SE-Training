package com.exceptions;

public class NumberNotValidException extends RuntimeException {
	public NumberNotValidException(String msg) {
		super(msg);
	}

	public NumberNotValidException(String msg, Exception e) {
		super(msg, e);
	}
}
