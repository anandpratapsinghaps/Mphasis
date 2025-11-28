package com.example.dp.singleton;
public class DatabaseConnection {
	/**
	 * Constructor is private
	 * Only one object is created
	 * Same instance returned every time
	 */

    // single instance (only one connection manager)
    private static DatabaseConnection instance;

    // constructor is private
    private DatabaseConnection() {
        System.out.println("DB Connection created!");
    }

    // global access
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to Database!");
    }
}
