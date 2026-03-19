import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Aula13 {
  public static void main(String[] args) throws Exception {
    Connection conn = DriverManager.getConnection("jdbc:sqlite:aula13/test.db");
    Statement stmt = conn.createStatement();

    stmt.executeUpdate("CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY, name TEXT, age INTEGER)");
    stmt.executeUpdate("DELETE FROM users");
    stmt.executeUpdate("INSERT INTO users (name, age) VALUES ('Alice', 30)");
    stmt.executeUpdate("INSERT INTO users (name, age) VALUES ('Bob', 25)");

    ResultSet rs = stmt.executeQuery("SELECT * FROM users");
    while (rs.next()) {
      System.out.println(
          "ID: " + rs.getInt("id") + " | Name: " + rs.getString("name") + " | Age: " + rs.getInt("age"));
    }

    rs.close();
    stmt.close();
    conn.close();
  }
}