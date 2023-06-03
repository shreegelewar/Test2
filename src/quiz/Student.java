package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Student extends ClassD {
	// Author by Ashwini Patil

	public Connection getconnection() {

		Connection connection2 = null;

		try {
			// step 1-Loading the class
			Class.forName("com.mysql.jdbc.Driver");
			// step 2-estabish the connection
			connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject", "root", "Shree@1994");

		} catch (Exception e) {
			System.out.println(e);
		}
		return connection2;
	}
	// Author by Prajwal Dharankar

	public void getdata(String firstname, String lastname, int Score, String grade) {
		PreparedStatement preparedstatement2 = null;
		Connection connection3 = null;

		try {
			// step 3 creatre prepared statement
			connection3 = getconnection();

			// step 3 creatre prepared statement
			preparedstatement2 = connection3
					.prepareStatement("insert into student (firstname,lastname,Score,grade)values(?,?,?,?)");
			preparedstatement2.setString(1, firstname);
			preparedstatement2.setString(2, lastname);
			preparedstatement2.setInt(3, Score);
			preparedstatement2.setString(4, grade);

			// step 4 statement excute
			preparedstatement2.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		Student student = new Student();
		student.getAnswer();
	}

}
