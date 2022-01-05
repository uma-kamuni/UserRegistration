package com.bridgelabz;

public class UserRegistrationMain {

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");
		UserRegistration user = new UserRegistration();
		user.FirstnameValidator();
		user.LastnameValidator();
		user.EmailValidator();
		user.PhoneNumberValidator();
		user.PasswordValidator();
	}
}