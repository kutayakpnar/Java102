import java.sql.*;

public class DBConnect {
    public static void main(String[] args){
        Connection connect=null;
        Statement st=null;
        String url="jdbc:mysql://localhost/university?username=kutay&password=1234";
        try{
            connect= DriverManager.getConnection(url);
           /* st=connect.createStatement();
            ResultSet data=st.executeQuery("SELECT * FROM student");
            while (data.next()){
                System.out.println("ID:"+ data.getInt("student_id"));
                System.out.println("Name:"+ data.getString("student_name"));
                System.out.println("**************");
            }

           /*Insert using statement

            String insertCode="INSERT INTO student(student_name,student_class) VALUES('Ahmet',4)";
            st.executeUpdate(insertCode); **/
           //Insert using prepared Statements
           /*PreparedStatement prSt= connect.prepareStatement("INSERT INTO student(student_name,student_class) VALUES(?,?)");
            prSt.setInt(2,5);
            prSt.setString(1,"Ali");
            prSt.executeUpdate(); //Its important!
            prSt.close(); */

            //Update Operations

            /* String upDatePr0="UPDATE student SET student_name=? WHERE student_id=?";
            st= connect.createStatement();
            st.executeUpdate("UPDATE student SET student_name='Veli' WHERE student_id=2");
            PreparedStatement pr=connect.prepareStatement(upDatePr0);
            pr.setInt(2,3);
            pr.setString(1,"Ayşe");
            pr.executeUpdate();
            pr.close();*/

            //Delete Operations

            /*String stql="DELETE FROM student WHERE student_id=4";
            String prsql="DELETE FROM student WHERE student_id=?";
            st= connect.createStatement();
            st.executeUpdate(stql);
            PreparedStatement pr=connect.prepareStatement(prsql);
            pr.setInt(1,5);
            pr.executeUpdate();
            pr.close();*/


            st.close();
            connect.close();


        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
