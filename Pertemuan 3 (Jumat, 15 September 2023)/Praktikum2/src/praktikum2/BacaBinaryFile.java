/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class BacaBinaryFile {
    public static void main(String[] args) {
        File filenya = new File("Objek.bin");
        FileInputStream reader = null;
        
        try{
            reader = new FileInputStream(filenya);
            int isi;
            while ((isi = reader.read()) != -1){
                System.out.println((char)isi);
        }
            reader.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
}
