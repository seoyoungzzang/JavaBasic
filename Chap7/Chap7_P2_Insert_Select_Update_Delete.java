package MysqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Chap7_P2 {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "kopo34";
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;

		try {

			conn = DriverManager.getConnection(dbURL, username, password);

			if (conn != null) {
				System.out.println("Connected");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		// Insert
		String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";

		PreparedStatement preparedstatement;
		try {
			preparedstatement = conn.prepareStatement(sql);
			preparedstatement.setString(1, "bill");
			preparedstatement.setString(2, "secretpass");
			preparedstatement.setString(3, "Bill Gates");
			preparedstatement.setString(4, "bill.gates@microsoft.com");

			int rowsInserted = preparedstatement.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("A new user was inserted successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Select
		String sql1 = "SELECT * FROM Users";

		try {
			statement = conn.createStatement();
			result = statement.executeQuery(sql1);

			int count = 0;

			while (result.next()) {
				String name = result.getString(2);
				String pass = result.getString(3);
				String fullname = result.getString("fullname");
				String email = result.getString("email");

				String output = "User #%d: %s - %s - %s - %s";
				System.out.println(String.format(output, ++count, name, pass, fullname, email));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Update
		String sql2 = "UPDATE Users SET password=?, fullname=?, email=? WHERE username=?";

		try {
			preparedstatement = conn.prepareStatement(sql2);
			preparedstatement.setString(1, "123456789");
			preparedstatement.setString(2, "William Henry Bill Gates");
			preparedstatement.setString(3, "bill.gates@microsoft.com");
			preparedstatement.setString(4, "bill");

			int rowsUpdated = preparedstatement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("An existing user was updated successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Delete
		String sql3 = "DELETE FROM Users WHERE username=?";

		try {
			preparedstatement = conn.prepareStatement(sql3);
			preparedstatement.setString(1, "bill");

			int rowsDeleted = preparedstatement.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("A user was deleted successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
