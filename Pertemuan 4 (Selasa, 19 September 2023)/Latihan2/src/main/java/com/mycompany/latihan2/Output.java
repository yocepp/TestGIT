/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class Output extends ConnectClass {
    
    public void outputData() throws SQLException {
        
        Statement st = connection.createStatement();
        
        System.out.println("[DATA ANGGOTA]");
        try {
            String query = "select * from datamahasiswa";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("Nama") + " - " + rs.getString("NIM") + " - " + rs.getString("Prodi"));
            }
//            connection.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
//        } finally {
//            ConnectClass.tutupKoneksi();
        }
    }  
}
