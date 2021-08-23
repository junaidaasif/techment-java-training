package techmentTrainingday10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		
		try
		{

//			STEP 1=====
			Class.forName("com.mysql.cj.jdbc.Driver");   // LOAD A DRIVER CLASS
			System.out.println("class not found");
			
			
			
//			STEP 2========= create connection
			Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false", "root", "Junaid@123");
			System.out.println("==Connected==");
			
			
			PreparedStatement ps= connection.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, 90);
			ps.setString(2, "Rahul");
			ps.setInt(3, 34000);
			ps.execute();
			
			System.out.println("enter the num how much data you want to insert");
			Scanner scanner = new Scanner(System.in);
			int num=scanner.nextInt();
			
			for(int i=1;i<=num;i++)
			{
				System.out.println("insert id ");
				int id = scanner.nextInt();
				ps.setInt(1, i);
				
				System.out.println("insert name ");
				String name = scanner.next();
				ps.setString(2, name);
				
				System.out.println("insert salary ");
				int salary = scanner.nextInt();
				ps.setInt(3, salary);
				
				ps.execute();
			}
			
			System.out.println("data inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}