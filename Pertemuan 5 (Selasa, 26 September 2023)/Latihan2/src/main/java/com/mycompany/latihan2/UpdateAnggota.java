/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UpdateAnggota extends ConnectClass {
    
    public void editAnggota() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        
        try{
            System.out.println("Masukan nama: ");
            String namaLama = scanner.nextLine();
            
            String selectSQL = "SELECT * FROM datamahasiswa WHERE nama = ?";
            PreparedStatement selectStatement = connection.prepareStatement(selectSQL);
            selectStatement.setString(1, namaLama);
            
            ResultSet resultSet = selectStatement.executeQuery();
            
            if(resultSet.next()){
                String nimLama = resultSet.getString("NIM");
                String prodiLama = resultSet.getString("prodi");
                
                System.out.println("[DATA ANGGOTA LAMA]");
                System.out.println( namaLama + " - " + nimLama + " - " + prodiLama);
                
                System.out.print("Masukan nama baru: ");
                String namaBaru = scanner.nextLine();
                
                System.out.print("Masukan NIM baru: ");
                String nimBaru = scanner.nextLine();
                
                System.out.print("Masukan prodi baru: ");
                String prodiBaru = scanner.nextLine();
                
                String updateSQL = "UPDATE datamahasiswa SET nama = ?, nim = ?, prodi = ? WHERE nama = ?";
                PreparedStatement updateStatement = connection.prepareStatement(updateSQL);
                updateStatement.setString(1, namaBaru);
                updateStatement.setString(2, nimBaru);
                updateStatement.setString(3, prodiBaru);
                updateStatement.setString(4, namaLama);
                
                int rowAffected = updateStatement.executeUpdate();
                
                if(rowAffected > 0){
                    System.out.println("Data berhasil diperbaharui");
                    System.out.println("[DATA ANGGOTA BARU]");
                    System.out.println(namaBaru + " - " + nimBaru + " - " + prodiBaru);
                } else{
                    System.out.println("Gagal memperbaharui data.");
                }
                
            } else{
                System.out.println("Data dengan nama tersebut tidak ada didatabase");
            }
        } catch(SQLException u){
            u.printStackTrace();
        }
    }
}
