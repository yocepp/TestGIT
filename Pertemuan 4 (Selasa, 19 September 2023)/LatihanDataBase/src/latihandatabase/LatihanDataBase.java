/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihandatabase;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author ASUS
 */
public class LatihanDataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        String url = "jdbc:mysql://localhost:3306/databasedemo";
        String username = "root";
        String password = "";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection(url, username, password);
            Statement st = koneksi.createStatement();
            System.out.println("Koneksi berhasil"); 
            
            String query = "select *from mobil";
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                System.out.println("Mobil " + rs.getString("vendor"));
                System.out.println("Tipe " + rs.getString("tipe"));
                System.out.println("CC Mesin " + rs.getString("mesin"));
                System.out.println("Kecepatan maksimal " + rs.getInt(4));
            }
            st.close();
            koneksi.close();
            System.out.println("koneksi ditutup...");
        } 
        catch (ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        

    }
    
}
