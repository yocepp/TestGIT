/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class LowerToUpper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        File fileInput1 = new File("Input.txt");
            
            System.out.print("Masukan kalimat lowercase: ");
            String lowercase1 = scanner.nextLine();

                    try {
                        PrintWriter writerInput1 = new PrintWriter(fileInput1);
                        writerInput1.print(lowercase1);
                        writerInput1.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

            File fileOutput1 = new File("Output.txt");
            String uppercase1 = lowercase1.toUpperCase();

                    try {
                        PrintWriter writerOutput1 = new PrintWriter(fileOutput1);
                        writerOutput1.print(uppercase1);
                        writerOutput1.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    System.out.println("Kalimat uppercasenya: " + uppercase1);
        
//        int pilihan;
        
//        System.out.println("Menu: ");
//        System.out.println("1.  Lowercase to Uppercase");
//        System.out.println("2.  Uppercase to Lowercase");
//        System.out.print("Masukan pilihan anda: ");
//        pilihan = scanner.nextInt();
//        
//        if (pilihan == 1){
//            File fileInput1 = new File("Input.txt");
//            
//            System.out.print("Masukan kalimat lowercase: ");
//            String lowercase1 = scanner.nextLine();
//
//                    try {
//                        PrintWriter writerInput1 = new PrintWriter(fileInput1);
//                        writerInput1.print(lowercase1);
//                        writerInput1.close();
//                    } catch (IOException ex) {
//                        ex.printStackTrace();
//                    }
//
//            File fileOutput1 = new File("Output.txt");
//            String uppercase1 = lowercase1.toUpperCase();
//
//                    try {
//                        PrintWriter writerOutput1 = new PrintWriter(fileOutput1);
//                        writerOutput1.print(uppercase1);
//                        writerOutput1.close();
//                    } catch (IOException ex) {
//                        ex.printStackTrace();
//                    }
//
//                    System.out.println("Kalimat uppercasenya: " + uppercase1);
//        } 
//        else if (pilihan == 2){
//            File fileInput2 = new File("Input.txt");
//                    System.out.print("Masukan kalimat uppercase: ");
//                    String uppercase2 = scanner.nextLine();
//
//                    try {
//                        PrintWriter writerInput2 = new PrintWriter(fileInput2);
//                        writerInput2.print(uppercase2);
//                        writerInput2.close();
//                    } catch (IOException ex) {
//                        ex.printStackTrace();
//                    }
//
//                    File fileOutput2 = new File("Output.txt");
//                    String lowercase2 = uppercase2.toUpperCase();
//
//                    try {
//                        PrintWriter writerOutput2 = new PrintWriter(fileOutput2);
//                        writerOutput2.print(lowercase2);
//                        writerOutput2.close();
//                    } catch (IOException ex) {
//                        ex.printStackTrace();
//                    }
//
//                    System.out.println("Kalimat lowercasenya: " + lowercase2);
//        }
        
        scanner.close();
        }
}
