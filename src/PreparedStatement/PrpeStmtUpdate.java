package PreparedStatement;
import java.sql.*;
public class PrpeStmtUpdate {

    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbc_demo";
        String uname="root";
        String pass="ENTER_YOUR-MYSQL_PASSWORD";

        Connection con=null;
        PreparedStatement ps = null;

        String sql="update students set name=? where id=?";

        try{

            con=DriverManager.getConnection(url,uname,pass);
            ps=con.prepareStatement(sql);

            ps.setString(1, "prabhas");
            ps.setInt(2,26);

            int i=ps.executeUpdate();

            System.out.println(i+"rows are updated ");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }




    }
    
}
