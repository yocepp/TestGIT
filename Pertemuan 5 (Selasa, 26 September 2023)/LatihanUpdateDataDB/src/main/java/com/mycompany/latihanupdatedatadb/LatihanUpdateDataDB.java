/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanupdatedatadb;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/**
 *
 * @author ASUS
 */
public class LatihanUpdateDataDB {

    public static void main(String[] args) throws SQLException {
    String url = "jdbc:mysql://localhost:3306/databasedemo";
    String username = "root";
    String password = "";
    
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection(url, username, password);
            
            String query = "UPDATE mobil SET vendor = ?, tipe = ?, mesin = ?, maxSpeed = ? WHERE id = ?";
            PreparedStatement st = koneksi.prepareStatement(query);
            st.setString(1, "Toyota");
            st.setString(2, "hilux");
            st.setString(3, "3000");
            st.setString(4, "250");
            st.setString(5, "9");
            
            st.executeUpdate();
            System.out.println("Data berhasil diubah");
            
            String queryDel = "DELETE FROM mobil WHERE id = ?";
            PreparedStatement stDel = koneksi.prepareStatement(queryDel);
            stDel.setInt(1, 8);
            
            stDel.executeUpdate();
            System.out.println("Data berhasil dihapus");
            
            st.close();
            stDel.close();
            koneksi.close();
            System.out.println("Koneksi ditutup....");
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
