import java.sql.*;

class Student {
    int id;
    String name;
    int age;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class JdbcInterviewQn{
    public static void main(String args[]){

        String url ="jdbc:mysql://localhost:3306/jdbc_demo";
        String uname="root";
        String password ="ENTER_YOUR-MYSQL_PASSWORD";
        String sql ="select * from students";

        Connection con=null;

        try{
            con = DriverManager.getConnection(url, uname, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){
                Student s = new Student();
                s.setId(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setAge(rs.getInt(3));

                // display 

               System.out.println(s.getId()+" "+s.getName()+" "+s.getAge());
            }

            rs.close();
            st.close();
            con.close();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}