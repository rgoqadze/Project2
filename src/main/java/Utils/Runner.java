package Utils;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static com.codeborne.selenide.Selenide.open;

public class Runner {
    @BeforeMethod
    public void Configuration() {
        System.setProperty("selenide.browser", "Chrome");
        Configuration.timeout = 4000;
        Configuration.browser = "Chrome";
        Configuration.browserSize = "1920x1080";
        open("https://www.swoop.ge/");
    }



    @AfterClass
    public void DeleteDataBase() throws SQLException {
        Connection Conn = ConnectToSql.SqlConnection();
        Statement stmt = Conn.createStatement();
        String DropQuery = "DROP DATABASE users";
        stmt.executeUpdate(DropQuery);
        stmt.close();
        Conn.close();
    }
}
