/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Num1
 */
public class Conn {

    public Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection con = null;
		try {
		
			Class.forName("com.mysql.jdbc.Driver");  
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll2","root","root");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
		return con;
	}

}

    

