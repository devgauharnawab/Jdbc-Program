/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypkg;

/**
 *
 * @author gauhar
 */
import java.io.*;
class FileHandle2{
        public static void main(String[] args){
      String homepath = System.getProperty("user.home");
        String sep = File.separator;
        File f = new File(homepath + sep + "abc" + sep + "data.txt");
        try{
        f.createNewFile();
        }catch(Exception e){
                e.printStackTrace();
        }

  }
}
