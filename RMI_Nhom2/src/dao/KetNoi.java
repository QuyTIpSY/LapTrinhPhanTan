/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;

/**
 *
 * @author quang
 */
public class KetNoi {
    public Connection cn;
    
    public void KetNoi() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLTaiKhoan;user=sa;password=123";
            cn = DriverManager.getConnection(url);
            System.out.println("Connected");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
   
}
