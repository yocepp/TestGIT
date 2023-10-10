/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihanbatchdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class LatihanBatchDB {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = ConnectClass.koneksiKeDB();
        
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection.setAutoCommit(false);
            
            String insertSQL = "INSERT INTO mobil (id, vendor, tipe, mesin, maxSpeed) VALUE (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            
            List<Data> dataToInsert = new ArrayList<>();
            dataToInsert.add(new Data("10", "Toyota", "Inova", "2500", "250"));
            dataToInsert.add(new Data("11", "Toyota", "G", "2000", "200"));
            dataToInsert.add(new Data("12", "Toyota", "V", "2500", "150"));
            dataToInsert.add(new Data("13", "Toyota", "Diesel", "2500", "150"));
            dataToInsert.add(new Data("14", "Toyota", "Bensin", "2500", "150"));
            
            for (Data data : dataToInsert){
                preparedStatement.setString(1, data.getKolom1());
                preparedStatement.setString(2, data.getKolom2());
                preparedStatement.setString(3, data.getKolom3());
                preparedStatement.setString(4, data.getKolom4());
                preparedStatement.setString(5, data.getKolom5());
                preparedStatement.addBatch();
            }
            
            int[] batchResults = preparedStatement.executeBatch();
            
            connection.commit();
            
            System.out.println("Data telah disimpan ke database");
        }
        catch(Exception ex){
            ex.printStackTrace();
            try{
                if (connection != null){
                    connection.rollback();
                }
            } catch(SQLException e){
                e.printStackTrace();
            }
        }
        finally{
            ConnectClass.tutupKoneksiKeDB();
        }
    }
}