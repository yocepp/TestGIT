/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package KalkulatorBangunRuang;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KalkulatorBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan nilai panjang : ");
        double Panjang = input.nextInt();

        System.out.print("Masukan nilai lebar : ");
        double Lebar = input.nextInt();

        System.out.print("Masukan nilai tinggi : ");
        double Tinggi = input.nextInt();

        Balok B = new Balok(Panjang, Lebar, Tinggi);
        B.printResult();
        
        System.out.print("Masukan nilai sisi : ");
        double Sisi = input.nextDouble();
        
        Kubus A = new Kubus (Sisi);
        A.printResult();
        
    }
    
}
