package com.company.singleresp;

//A separate class for handling persistence 
public class UserService {

	private InMemoryUserDB db;

	public UserService() {
		db = new InMemoryUserDB();
	}
	
	public void saveUser(User user) {
		db.saveUser(user);
	}

	public User getUser(String userName) {
		return db.getUser(userName);
	}

}
