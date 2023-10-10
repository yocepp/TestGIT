/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class UpperToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File fileInput2 = new File("Input.txt");
        System.out.print("Masukan kalimat uppercase: ");
        String uppercase2 = scanner.nextLine();

        try {
             PrintWriter writerInput2 = new PrintWriter(fileInput2);
             writerInput2.print(uppercase2);
             writerInput2.close();
        } catch (IOException ex) {
             ex.printStackTrace();
        }

        File fileOutput2 = new File("Output.txt");
        String lowercase2 = uppercase2.toLowerCase();

        try {
            PrintWriter writerOutput2 = new PrintWriter(fileOutput2);
            writerOutput2.print(lowercase2);
            writerOutput2.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        System.out.println("Kalimat lowercasenya: " + lowercase2);
    }
    
}
