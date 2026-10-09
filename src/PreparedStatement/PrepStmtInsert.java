package PreparedStatement;
import java.sql.*;
public class PrepStmtInsert {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbc_demo";
        String uname="root";
        String pass = "ENTER_YOUR-MYSQL_PASSWORD";

        Connection con =null;
        
        String sql="insert into students values (?,?,?);";
        
        try{

            con=DriverManager.getConnection(url,uname,pass);
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 26);
            ps.setString(2,"Prabhas");
            ps.setInt(3,23);

            int i=ps.executeUpdate();

            System.out.println(i+"rows are inserted inserted");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    }
}
