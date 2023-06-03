package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ClassD2 {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	

	//public static void main(String[] args) throws SQLException {
	public void getQuestion() throws SQLException {
		

		try {

			// Step 1 Loading the class
			Class.forName("com.mysql.jdbc.Driver");

			// Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root", "Shree@1994");

			// Prepared Statement with select query
			ps = con.prepareStatement("select * from quiz");
		

			

		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		//getAnswer();
		finally 
		{
			con.close();
			ps.close();
			rs.close();

		} 
		
		
	}
	public void getAnswer() throws SQLException {
		
		
		
		
		
		
		
		rs = ps.executeQuery();
		while (rs.next()) {

			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getString(6));
		//	System.out.println("Answer - "+Ans1);
			
			System.out.println();
			

		}
	}
	public static void main(String[] args) throws SQLException  {
		
		Scanner scanner=new Scanner(System.in);
		String Ans1=scanner.next();
		
		
		
		ClassD2 classD2=new ClassD2();
		classD2.getQuestion();
	 //  classD.getAnswer(Ans1);
		
		
		
	
	}

}
