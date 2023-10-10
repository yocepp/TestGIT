/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        System.out.println("Hello World!");
        Connection connection = ConnectClass.dptKonek();
        Scanner scanner = new Scanner (System.in);
        Statement st = connection.createStatement();
        
        System.out.println("[SELAMAT DATANG DI PERPUS PUSAT UNS]");
        System.out.println("1.  Pendaftaran anggota");
        System.out.println("2.  Tampilkan semua data anggota");
        System.out.println("3.  Ubah data anggota");
        System.out.println("4.  Hapus data anggota");
        System.out.println("5.  Keluar");
        
        try{
            while(true){
                System.out.println("=====================================");
                System.out.print("Masukan perintah: ");
                String inputUser = scanner.nextLine();
                
                if("1".equals(inputUser)){
                    InputAnggota inputData = new InputAnggota();
                    inputData.inputAnggotaPerpus();
                }
                else if("2".equals(inputUser)){
                    TampilkanAnggota output = new TampilkanAnggota();
                    output.outputData();
                }
                else if("3".equals(inputUser)){
                    UpdateAnggota editA = new UpdateAnggota();
                    editA.editAnggota();
                }
                else if("4".equals(inputUser)){
                    DeleteAnggota hapusAnggota = new DeleteAnggota();
                    hapusAnggota.hapusAnggota();
                }
                else if("5".equals(inputUser)){
                    System.out.println("Sampai jumpa!");
                    break;
                }
                else{
                    System.out.println("Tidak ada dalam pilihan menu.");
                }
            }
        } catch(SQLException x){
            x.printStackTrace();
        }
        ConnectClass.tutupKoneksi();
        st.close();
    }
}
