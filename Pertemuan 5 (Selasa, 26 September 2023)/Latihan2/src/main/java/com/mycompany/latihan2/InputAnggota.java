/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihan2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class InputAnggota extends ConnectClass  {
    
    public void inputAnggotaPerpus()throws SQLException{
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukan Prodi: ");
        String prodi = scanner.nextLine();
        
        String insertQuery = "insert into datamahasiswa (Nama, NIM, Prodi) values (?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(insertQuery);
        ps.setString(1, nama);
        ps.setString(2, nim);
        ps.setString(3, prodi);

        int rowAffected = ps.executeUpdate();

        if (rowAffected > 0) {
            System.out.println("Data berhasil dibuat");
        } else {
            System.out.println("Gagal memasukan data");
        }
//        ps.close();
    }
}
