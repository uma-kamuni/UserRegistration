package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	private static final String NamePattern = "^[A-Z]{1}[a-z]{2,}$"; //pattern is fixed and final (static final)
	Scanner scanner = new Scanner(System.in);

	public void FirstnameValidator() {
		System.out.println("Enter First Name");
		String input = scanner.next();
		if (input.matches(NamePattern)) {   //if entered name is matching with pattern then true
			System.out.println("first name sucessfully entered");
		} else {
			System.out.println("**Invalid First name**try again**");
			FirstnameValidator();
		}
	}
}