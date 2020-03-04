import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/training_epam?currentSchema=javaclassestask";
    static final String USER = "postgres";
    static final String PASS = "admin";

    ArrayList getData(String query) {
        List<Student> list = new ArrayList<>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    list.add(new Student(rs.getInt("id"), rs.getString(2),
                                            rs.getString(3), rs.getString(4), rs.getString(5),
                                             rs.getString(6), rs.getString(7), rs.getString(8),
                                                rs.getByte(9), rs.getString(10)));
                }
                rs.close();
                stmt.close();
            } finally {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (ArrayList) list;
    }
}
