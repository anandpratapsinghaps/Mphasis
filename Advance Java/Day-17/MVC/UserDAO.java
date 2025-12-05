package com.example.mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
	/*
	 * CREATE TABLE emp (
    id INT AUTO_INCREMENT PRIMARY KEY,  -- Unique ID for each employee
    firstname VARCHAR(50) NOT NULL,     -- First name of the employee
    lastname VARCHAR(50) NOT NULL,      -- Last name of the employee
    password VARCHAR(255) NOT NULL,     -- Password (use VARCHAR with hashing in mind)
    age INT NOT NULL,                   -- Age of the employee
    address VARCHAR(255),               -- Address of the employee
    gender ENUM('Male', 'Female', 'Other'), -- Gender (restricted to specific values)
    country VARCHAR(100) NOT NULL       -- Country of the employee
);

	 */
	
	private Connection createConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "root");
		} catch (Exception e) {
			throw new SQLException("Error creating connection", e);
		}
	}

	public boolean insertUser(User user) throws RegistrationException {
		boolean flag = false;
		try {
			Connection con = createConnection();
			String qryString = "INSERT INTO emp(firstname, lastname, password, age, address, gender, country) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement prepStatement = con.prepareStatement(qryString);
			
			prepStatement.setString(1, user.getName());
			prepStatement.setString(2, user.getLastName());
			prepStatement.setString(3, user.getPassword());
			prepStatement.setInt(4, user.getAge());
			prepStatement.setString(5, user.getAddress());
			prepStatement.setString(6, user.getGender());
			prepStatement.setString(7, user.getCountry());
			
			if (prepStatement.executeUpdate() > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			throw new RegistrationException("Error inserting user"+ e);
		}
		return flag;
	}
}
