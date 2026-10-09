import java.sql.*;
public class Delet {
    public static void main(String[] args) {
        String str ="jdbc:mysql://localhost:3306/jdbc_demo";
        String uname="root";
        String pass="ENTER_YOUR-MYSQL_PASSWORD";

        Connection con =null;
        Statement st=null;

        String sql ="delete from students where id=99";
        try{
            con=DriverManager.getConnection(str,uname,pass);
            st=con.createStatement();
            int i=st.executeUpdate(sql);
            System.out.println(i+" rows are deleted ");

        }catch(Exception e){
            e.getMessage();
        }
    }
}
