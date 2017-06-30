import java.sql.*;

import utility.DBConnection;

public class DBConnectionTest {

    public static void main(String[] args) {
        Connection conn = DBConnection.getDBConnection();

        try {
            String query = "select * from student";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
