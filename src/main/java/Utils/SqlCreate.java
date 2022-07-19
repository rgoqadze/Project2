package Utils;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlCreate {
    @Test
    public void CreateDBAndTable() throws SQLException {
        Connection Conn = ConnectToSql.SqlConnection();
        Statement stmt = Conn.createStatement();
        String QueryCreateDB = "CREATE DATABASE users";

        String QueryCreateTable = "CREATE TABLE [users].[dbo].[users]("
                + "id INT NOT NULL IDENTITY(1,1) PRIMARY KEY, "
                + "firstName varchar(50), "
                + "lastName varchar(50), "
                + "phone varchar(50), "
                + "password varchar(50),"
                + "address varchar(50), "
                + "email varchar(50), "
                + "state varchar(50), "
                + "city varchar(50), "
                + "zip int , )";
       stmt.executeUpdate(QueryCreateDB);
        stmt.executeUpdate(QueryCreateTable);
        stmt.close();
        Conn.close();

    }
}




