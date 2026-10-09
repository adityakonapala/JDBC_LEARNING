import java.sql.*;
public class Update {
    public static void main(String[] args) {
        String str = "jdbc:mysql://localhost:3306/jdbc_demo";
        String uname ="root";
        String pass="ENTER_YOUR-MYSQL_PASSWORD";

        Connection con=null;
        Statement st=null;

        String sql="update students set id=100 where id=101;";

        try{
            con=DriverManager.getConnection(str,uname,pass);
            st=con.createStatement();
            int i=st.executeUpdate(sql);
            System.out.println(i+" rows is updated ");

        }catch(Exception e){
            e.getMessage();
        }
    }
}
