/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ujicobapisahclasslat1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UjiCobaPisahClassLat1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = KonekClass.dptKonek();
        
        if (connection != null){
            try{
                Statement st = connection.createStatement();
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
                    PreparedStatement ps = connection.prepareStatement(insertQuery);
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
                
                String query = "select * from mobil";
                ResultSet rs = st.executeQuery(query);
                
                while(rs.next()){
                    System.out.println("\nMobil " + rs.getString("vendor"));
                    System.out.println("Tipe " + rs.getString("tipe"));
                    System.out.println("CC Mesin " + rs.getString("Mesin"));
                    System.out.println("Kecepatan maksimal " + rs.getString("maxSpeed"));
                }
                
                st.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            finally{
                KonekClass.tutupKoneksi();
                System.out.println("\nKoneksi ditutup....");
            }
        }
        else{
            System.out.println("Gagal terhubung ke database");
        }
    }
}
