import java.sql.*;
class jdbc {
    public static void main(String[] args) {
        try{
        String constr = "jdbc:mysql://localhost/ri_db";
        String user = "rohit";
        String password = "rohit123";
        Connection con = DriverManager.getConnection(constr, user, password);
        System.out.println("Connection established successfully.");
        // Create a statement object to execute SQL queries
        Statement st = con.createStatement();
        // createing a table
        st.executeUpdate("create table student (id int, name varchar(20), age int)");
        System.out.println("Table created successfully.");
        // inserting values into the table
        st.executeUpdate("insert into student values (1, 'rohit', 20)");
        st.executeUpdate("insert into student values (2, 'ravi', 21)");
        st.executeUpdate("insert into student values (3, 'raj', 22)");
        System.out.println("Values inserted successfully.");
        // updating the data
        st.executeUpdate("update student set age = 25 where id = 1");
        System.out.println("age  updated of rohit successfully.");
        // deleting the data
        st.executeUpdate("delete from student where id = 2");
        System.out.println("data deleted successfully.");
        ResultSet rs = st.executeQuery("select * from student");
        while(rs.next()) {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
        }
        rs.close();
        st.close();
        con.close();
    }catch(Exception e){
        System.out.println(e);
    }
}
}