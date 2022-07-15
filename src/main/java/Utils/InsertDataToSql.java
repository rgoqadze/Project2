package Utils;

import DataObject.RegistrationData;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataToSql implements RegistrationData {
    @Test
    public void InsertQuery() throws SQLException {
        Connection Conn = ConnectToSql.SqlConnection();
        String InsertDataQuery = "INSERT INTO [users].[dbo].[users] (firstname, lastname, phone, password, address, email, state, city, zip)" + "VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement prst = Conn.prepareStatement(InsertDataQuery);
        prst.setString(1,FirstNameValue);
        prst.setString(2,LastNameValue);
        prst.setString(3,PhoneNumberValue);
        prst.setString(4,PasswordValue);
        prst.setString(5,AddressValue);
        prst.setString(6,EmailValue);
        prst.setString(7,StateValue);
        prst.setString(8,CityValue);
        prst.setString(9, String.valueOf(Zip));
        prst.executeUpdate();
        Conn.close();
    }
}
