package com;

import java.io.*;
import java.util.Scanner;
import com.exceptions.ValidStudentIdException;

class StudentVerification {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Student ID Number ");

		String studentId = scanner.next();
		try {
			validateStudentId(studentId);
		} catch (ValidStudentIdException e) {
			System.err.print(e);
		}
	}

	static void validateStudentId(String studentId) throws ValidStudentIdException {

		if ((studentId.equals("12345678"))) {
			System.out.println("Entered Student ID Number is Valid!");
		}

		else {
			throw new ValidStudentIdException("Please enter valid Student Id Number!");
		}
	}
}
