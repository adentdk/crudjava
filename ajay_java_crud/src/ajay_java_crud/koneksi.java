/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajay_java_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author adentrisnadk
 */
public class koneksi {
    static Connection conn;
    static String url = "jdbc:mysql://localhost/crudjava";
    static String user = "root";
    static String pass = "";
    
    
    public static Connection getCon(){
        if(conn == null){
            try{
                conn = DriverManager.getConnection(url,user,pass);
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return conn;
    }
}
