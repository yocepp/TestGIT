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
        Connection connection = ConnectClass.dptKonek();
        Scanner scanner = new Scanner(System.in);
        Statement st = connection.createStatement();

        System.out.println("[SELAMAT DATANG DI PERPUS PUSAT UNS]");
        System.out.println("1.  Pendaftaran anggota");
        System.out.println("2.  Tampilkan data anggota");
        System.out.println("3.  Keluar");
        
        try {
        while(true){
            System.out.println("=====================================");
            System.out.print("Masukan perintah: ");
            String inputUser = scanner.nextLine();
            
            if("1".equals(inputUser)){
                InputClass inputData = new InputClass();
                inputData.inputAnggota();
                
            }
            else if ("2".equals(inputUser)){
                Output printOutput = new Output();
                printOutput.outputData();
            }   
            else if("3".equals(inputUser)){
                break;
            }
            else{
                System.out.println("Tidak ada dalam pilihan");
            }
         }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        ConnectClass.tutupKoneksi();
        st.close();
    }
    
}
