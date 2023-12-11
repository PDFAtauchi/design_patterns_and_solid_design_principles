package com.company.singleresp;

import java.io.IOException;

public class Main {

	private static final String VALID_USER_JSON = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";
	
	private static final String INVALID_USER_JSON = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";

	public static void main(String[] args) throws IOException {
		UserController userController = new UserController();
		
		String response = userController.createUser(VALID_USER_JSON);	
		if(!response.equalsIgnoreCase("SUCCESS")) {
			System.err.println("Failed");
		}
		System.out.println("Valid JSON received response: " + response);

		response = userController.createUser(INVALID_USER_JSON);
		if(!response.equalsIgnoreCase("ERROR")) {
			System.err.println("Failed");
		}
		System.out.println("Invalid JSON received response: " + response);

		String userName1 = "Randy";
		User user1 = userController.getUser(userName1);
		if (user1 != null) {
			System.out.println("User Found");
		} else {
			System.out.println("User Not Found");
		}

		String userName2 = "Pedro";
		User user2 = userController.getUser(userName2);
		if (user2 != null) {
			System.out.println("User Found");
		} else {
			System.out.println("User Not Found");
		}
	}
}
