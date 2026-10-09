package PreparedStatement;
import java.sql.*;
public class PrepStmtSelect {
    public static void main(String[] args) {
        String str="jdbc:mysql://localhost:3306/jdbc_demo";
        String uname="root";
        String pass="ENTER_YOUR-MYSQL_PASSWORD";

        Connection con=null;
        PreparedStatement ps=null;

        String sql="select * from students where id=?";

        try{
            con=DriverManager.getConnection(str,uname,pass);
            ps = con.prepareStatement(sql);
            ps.setInt(1,26);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                
                int id = rs.getInt("id");
                String name=rs.getString("name");
                int age=rs.getInt("age");

                System.out.println(id+" "+name+" "+age);

            }
        }catch(Exception e){
            e.getMessage();
        }

    }
}
