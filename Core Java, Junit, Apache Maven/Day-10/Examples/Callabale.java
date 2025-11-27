package com.example.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Callabale {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
/**
 *   CREATE  FUNCTION getEmployeeFullName(employeeId INT) 
 *   RETURNS varchar(255) 
     DETERMINISTIC
 BEGIN
    DECLARE fullName VARCHAR(255);
    
    SELECT CONCAT(fname, ' ', lname) INTO fullNamelll
    FROM emp
    WHERE id = employeeId;
    
    RETURN fullName;
END
 * 
 */
		
		int employeeId=2;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		
		//The first ? (before =) is the output parameter.
		//The second ? (inside the parentheses) is the input parameter.
		String sql="{? = CALL getEmployeeFullName(?)}";
		
		CallableStatement cs= con.prepareCall(sql);
		
		//Register the output parameter (first parameter)
		cs.registerOutParameter(1, java.sql.Types.VARCHAR);
		
		// Set the input parameter (second parameter)
		cs.setInt(2, employeeId);
		cs.execute();
		
		// Retrieve the output parameter
		 String s1=cs.getString(1);
		 
		 System.out.println("Employee Full name: "+s1);
		 
		
		
		
		
		
		

	}

}
