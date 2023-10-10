/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan2;
import java.io.*;

/**
 *
 * @author ASUS
 */
public class Latihan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sumberGambar = "gambarasli.jpg";
        String tujuanGambar = "gambarduplikat.jpg";
        
        try {
            FileInputStream input = new FileInputStream(sumberGambar);
            
            FileOutputStream output = new FileOutputStream(tujuanGambar);
            
            byte[] buffer = new byte[10];
            int bacaBit;
            
            while((bacaBit = input.read(buffer)) != -1){
                output.write(buffer, 0, bacaBit);
            }
            input.close();
            output.close();
            
            System.out.println("Gambar sudah diduplikasi");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
}
