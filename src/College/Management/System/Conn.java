/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package College.Management.System;
import java.sql.*;
/**
 *
 * @author monik
 */
public class Conn {
    private static final String url="jdbc:mysql://localhost:3306/monika";
    private static final String root="root";
    private static final String password="Mona@2618";

       public static Connection conn(){
           
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,root,password);
        return con;
}catch(Exception e){
            System.out.print(e);
             return null;
}
    }
}
