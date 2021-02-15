package com;

import java.util.*;

import com.exceptions.NumberNotValidException;
import com.exceptions.UserInputInvalidException;

public class Wrapper {
	public static void main(String args[]) {
		int a, b, answer;

		System.out.println("Enter No: ");
		Scanner scanner = new Scanner(System.in);
		b = scanner.nextInt();

		try {
			if (b == 0)
				throw new UserInputInvalidException("Infinity loop got created..");

			a = 10;

			answer = a / b;

			System.out.println("Answer: " + answer);

		} catch (UserInputInvalidException e) {
			throw new NumberNotValidException("Enter valid number next time!", e);
		}
	}
}