/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File filenya = new File("text.txt");
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Masukan NIM Anda : ");
        String nim = scan.nextLine();
        
        System.out.println("Masukan Nilai Anda : ");
        double nilai = scan.nextDouble();
        
        try {
            PrintWriter writer = new PrintWriter (filenya);
            
            writer.println("Nilai Praktikum Pemrograman");
            writer.printf("NIM: %s \n", nim);
            writer.print(nilai);
            
            writer.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
}
