package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	private static final String NamePattern = "^[A-Z]{1}[a-z]{2,}$"; // regex pattern is fixed and final (static final)
	private static final String EmailPattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";
	Scanner scanner = new Scanner(System.in);

	public void FirstnameValidator() {
		System.out.println("Enter First Name");
		String input = scanner.next();
		if (input.matches(NamePattern)) { // if entered name is matching with pattern then true
			System.out.println("first name sucessfully entered");
		} else {
			System.out.println("**Invalid First name**try again**");
		}
	}

	public void LastnameValidator() {
		System.out.println("Enter Last Name");
		String input = scanner.next();
		if (input.matches(NamePattern)) { // if entered name is matching with pattern then true
			System.out.println("Last name sucessfully entered");
		} else {
			System.out.println("**Invalid Last name**try again**");
		}
	}

	public void EmailValidator() {
		System.out.println("Enter the email id :");
		String input = scanner.next();
		if (input.matches(EmailPattern)) {
			System.out.println("email id sucessfully entered");
		} else {
			System.out.println("**Invalid email id**try again**");
		}
	}
}