/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NABILA
 */
public class Koneksi {
    static Connection con;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/apotek_1","root","");
            
        } catch(Exception ex) {
            System.out.println(""+ex);
        }
        return con;
    }
}

