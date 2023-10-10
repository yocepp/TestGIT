/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihandatabasemaven;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LatihanDataBaseMaven {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/databasedemo";
        String username = "root";
        String password = "";  
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection(url, username, password);
            
            Statement st = koneksi.createStatement();
            System.out.println("Koneksi berhasil");
            
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Masukan data mobil baru: ");
                
                System.out.print("Id: ");
                String id = scanner.nextLine();

                System.out.print("Vendor: ");
                String vendor = scanner.nextLine();

                System.out.print("Tipe: ");
                String tipe = scanner.nextLine();

                System.out.print("CC Mesin: ");
                String ccMesin = scanner.nextLine();

                System.out.print("Kecepatan maximal: ");
                String kecMax = scanner.nextLine();

                String insertQuery = "insert into mobil (id, vendor, tipe, mesin, maxSpeed) values (?, ?, ?, ?, ?)";
                PreparedStatement ps = koneksi.prepareStatement(insertQuery);
                ps.setString(1, id);
                ps.setString(2, vendor);
                ps.setString(3, tipe);
                ps.setString(4, ccMesin);
                ps.setString(5, kecMax);

                int rowAffected = ps.executeUpdate();

                if (rowAffected > 0) {
                    System.out.println("Data mobil berhasil dimasukan ke database");
                } else {
                    System.out.println("Gagal memasukan data mobil ke database");
                }

                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            String query = "select *from mobil";
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                System.out.println("\nMobil " + rs.getString("vendor"));
                System.out.println("Tipe " + rs.getString("tipe"));
                System.out.println("CC Mesin " + rs.getString("Mesin"));
                System.out.println("Kecepatan maksimal " + rs.getString("maxSpeed"));
            }
            
            st.close();
            koneksi.close();
            System.out.println("\nKoneksi ditutup....");
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }
}
