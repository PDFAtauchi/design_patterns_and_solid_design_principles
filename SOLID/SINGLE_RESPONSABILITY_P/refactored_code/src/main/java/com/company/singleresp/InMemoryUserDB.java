package com.company.singleresp;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUserDB {

    private static final Map<String, User> db = new HashMap<>();

    public void saveUser(User user) {
        synchronized(db) {
            db.put(user.getName(), user);
        }
    }

    public User getUser(String userName) {
        synchronized(db) {
            return db.get(userName);
        }
    }
}