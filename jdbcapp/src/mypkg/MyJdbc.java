/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypkg;
import java.sql.*;

/**
 *
 * @author gauhar
 */
public class MyJdbc {
    public static void main(String args[]){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
         String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
            String username = "gauhar";
            String password = "gauhar123";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st = con.createStatement();
            //String query = "INSERT INTO mytable (name, university) VALUES ('Aamir Naved', 'IntegralUniversity')";
            String query = "SELECT name,university FROM mytable";
            ResultSet rs = st.executeQuery(query);
            new ResultProcessor().printData(rs);
          /*  while(rs.next()){
                System.out.println(rs.getString("name")+ "  "+ rs.getString("university"));
            }*/
         //   st.execute(query);
        }catch(ClassNotFoundException | SQLException cnf){
        }
    }
}
