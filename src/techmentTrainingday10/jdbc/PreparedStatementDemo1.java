package techmentTrainingday10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo1 {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class is found");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of employees");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter salary");
		int salary=sc.nextInt();


		
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false","root","Junaid@123");
	

	PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setInt(3, salary);
	ps.execute();
	System.out.println("Inserted");
		}
		
	
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}