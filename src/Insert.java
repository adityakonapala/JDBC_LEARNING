import java.sql.*;
public class Insert {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/jdbc_demo";
        String uname="root";
        String pass="ENTER_YOUR-MYSQL_PASSWORD";
        Connection con=null;
        Statement st=null;
        String sql ="insert into students values (29,'venkat',30);";

        try{
            con = DriverManager.getConnection(url,uname,pass);
            st=con.createStatement();
              int i= st.executeUpdate(sql);

              System.out.println(i+"rows are inserted");


        }catch(Exception e){

        }


    }
}
