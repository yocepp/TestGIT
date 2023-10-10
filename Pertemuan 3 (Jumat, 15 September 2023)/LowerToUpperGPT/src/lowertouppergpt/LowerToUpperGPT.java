/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lowertouppergpt;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LowerToUpperGPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string in lowercase: ");
        String input = scanner.nextLine();

        String uppercaseString = input.toUpperCase();

        System.out.println("String in uppercase: " + uppercaseString);

        scanner.close();
    }
    
}
