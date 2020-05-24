import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) {
        /*
         * MySQL5.7
         * driver = com.mysql.jdbc.Driver
         * url = jdbc:mysql://localhost:3306/test?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF8
         *
         * MySQL8.0
         * driver = com.mysql.cj.jdbc.Driver
         * url = jdbc:mysql://localhost:3308/test?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF8&amp;serverTimezone=UTC
         */
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF8";
        String username = "root";
        String password = "201606";
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.print(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
