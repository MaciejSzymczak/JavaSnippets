package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class OracleDemo {

	public static void main(String[] args) {
		
		//Required: ojdbc14.jar
		//http://javabeginnerstutorial.com/code-base/how-to-connect-to-oracle-database-in-java-using-eclipse/
		
        Scanner scanner = new Scanner(System.in);
        System.out
                .println("Please provide below details to connect Oracle Database");
        System.out.println("Enter Database");
        String dbName = scanner.next();
        System.out.println("Enter UserName");
        String userName = scanner.next();
        System.out.println("Enter Password");
        String password = scanner.next();
 
        try {
 
            Class.forName("oracle.jdbc.driver.OracleDriver");
 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        Connection connection = null;
 
        try {
 
            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:" + dbName, userName,
                    password);
 
        } catch (SQLException e) {
 
            e.printStackTrace();
        }
 
        if (connection != null) {
            System.out.println("nSuccessfullly connected to Oracle DB");
        } else {
            System.out.println("nFailed to connect to Oracle DB");
        }
	}

}
