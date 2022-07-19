package Utils;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelectFromSql {
    public String firstname, lastname, phone, password, address, email, state, city, zip;
    @Test
    public void SelectQuery() throws SQLException {
        Connection Conn = ConnectToSql.SqlConnection();
        Statement stmt = Conn.createStatement();
        String SelectDaraQuery = "SELECT * FROM users";
        ResultSet resultSet = stmt.executeQuery(SelectDaraQuery);
        while (resultSet.next()) {
            firstname = resultSet.getString("firstName");
            lastname = resultSet.getString("lastName");
            phone = resultSet.getString("phone");
            password = resultSet.getString("password");
            address = resultSet.getString("address");
            email = resultSet.getString("email");
            state = resultSet.getString("state");
            city = resultSet.getString("city");
            zip = resultSet.getString("zip");
        }
        Conn.close();
    }
}


