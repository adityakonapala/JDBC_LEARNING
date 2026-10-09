import java.sql.*;

public class Select {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String uname = "root";
        String pass = "ENTER_YOUR-MYSQL_PASSWORD";

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        String sql = "select * from students;";

        try {
            con = DriverManager.getConnection(url, uname, pass);
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " " + name + " " + age);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
