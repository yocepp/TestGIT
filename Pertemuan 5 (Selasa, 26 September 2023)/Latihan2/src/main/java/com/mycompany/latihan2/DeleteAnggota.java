/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DeleteAnggota extends ConnectClass {
    
    public void hapusAnggota() throws SQLException{
        
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.print("Masukan nama: ");
            String namaDel = scanner.nextLine();
            
            String selectSQL = "SELECT * FROM datamahasiswa WHERE nama = ?";
            PreparedStatement selectStatement = connection.prepareCall(selectSQL);
            selectStatement.setString(1, namaDel);
            
            ResultSet resultSet = selectStatement.executeQuery();
            
            if(resultSet.next()){
                String nama = resultSet.getString("Nama");
                String nim = resultSet.getString("NIM");
                String prodi = resultSet.getString("Prodi");
                
                System.out.println("[DATA ANGGOTA]");
                System.out.println(nama + " - " + nim + " - " + prodi);
                
                System.out.print("Apakah data ini yang ingin Anda hapus (y/n): ");
                String jawabanUser = scanner.next();
                
                if(jawabanUser.equalsIgnoreCase("y")){
                    String deleteSQL = "DELETE FROM datamahasiswa WHERE nama = ?";
                    PreparedStatement deleteStatement = connection.prepareStatement(deleteSQL);
                    deleteStatement.setString(1, namaDel);
                    
                    int rowsAffected = deleteStatement.executeUpdate();
                    
                    if(rowsAffected > 0){
                        System.out.println("Data berhasil dihapus!");
                    } else{
                        System.out.println("Data gagal dihapus.");
                    }
                } else{
                    System.out.println("Tidak jadi menghapus data.");
                }
            } else{
                System.out.println("Data dengan nama tersebut tidak ditemukan di database");
            }
        } catch (SQLException y){
            y.printStackTrace();
        }
    }
    
}
