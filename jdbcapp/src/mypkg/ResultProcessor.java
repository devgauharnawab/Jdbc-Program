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
public class ResultProcessor {
    public void printData(ResultSet rs){
        try{
        int cc = rs.getMetaData().getColumnCount();
        while(rs.next()){
            for(int i = 1; i <= cc; i++){
                System.out.print(rs.getString(i) + " ");
            }
            System.out.println();
        }
      }catch(SQLException se){
          se.printStackTrace();
      }
        
    }
    
}
