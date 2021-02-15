package com;

import com.exceptions.InvalidStudentCountException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClassRoom {

	public static void validateStudentCount(int totalStudents) {

		if (totalStudents > 50) {
			throw new InvalidStudentCountException("Class room can't have more than 50 Students!!!");
		}

		System.out.println("Class room have valid no of Students!!!");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of student in the class: ");

		int totalStudents = scanner.nextInt();

		validateStudentCount(totalStudents);
	}
}
