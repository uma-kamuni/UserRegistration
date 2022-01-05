package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	private static final String NamePattern = "^[A-Z]{1}[a-z]{2,}$"; // regex pattern is fixed and final (static final)
	private static final String EmailPattern = "^[0-9a-zA-Z]+([.\\-+]?[a-zA-Z0-9]+)?\\@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2,})*$";
	private static final String PhonenumberPattern = "^\\+?([0-9]{2})\\)?([0-9]{10})$";
	private static final String PasswordPattern ="^[A-Za-z]{8}$";

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

	public void PhoneNumberValidator() {
		System.out.println("Enter the phone Number:");
		String input = scanner.next();
		if (input.matches(PhonenumberPattern)) {
			System.out.println("phone number sucessfully entered");
		} else {
			System.out.println("**Invalid phone number**try again**");
		}
	}
	public void PasswordValidator() {
		System.out.println("Enter the password:");
		String input = scanner.next();
		if (input.matches(PasswordPattern)) {
			System.out.println("password sucessfully entered");
		}
		else {
			System.out.println("**Invalid password**try again**");
		}
	}
}