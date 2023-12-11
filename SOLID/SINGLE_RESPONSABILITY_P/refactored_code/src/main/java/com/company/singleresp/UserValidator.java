package com.company.singleresp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

	public boolean validateUser(User user) {
		return isValidUser(user);
	}
	
    private boolean isValidUser(User user) {
        if(!isPresent(user.getName())) {
            return false;
        }

        if(!isValidAlphaNumeric(user.getName())) {
            return false;
        }

        if(!isValidEmail(user.getEmail())) {
            return false;
        }

        user.setName(user.getName().trim());
        user.setEmail(user.getEmail().trim());

        return true;
    }
    
    private boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }

    private boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]"); 
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }

    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }

}
