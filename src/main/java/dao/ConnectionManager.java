package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {

  public Connection connection = DriverManager.getConnection("jdbc:mysql://moktok.intecbrussel.org:33061/emrah",
            "emrah", "emrah2021");


   public Statement statement = connection.createStatement();

    public ConnectionManager() throws SQLException {
    }
}
