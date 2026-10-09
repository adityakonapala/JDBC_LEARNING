package PreparedStatement;
import java.sql.*;
public class PrepStmtDelet {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbc_demo";
        String uname="root";
        String pass="ENTER_YOUR-MYSQL_PASSWORD";

        Connection con=null;
        PreparedStatement ps=null;

        String sql="delete from students where id=?";

        try{

            con=DriverManager.getConnection(url,uname,pass);
            ps = con.prepareStatement(sql);

            ps.setInt(1,26);

            int i=ps.executeUpdate();

            System.out.println(i+" rows are updated ");

        }catch(Exception e){
            e.getMessage();
        }
    }
}
