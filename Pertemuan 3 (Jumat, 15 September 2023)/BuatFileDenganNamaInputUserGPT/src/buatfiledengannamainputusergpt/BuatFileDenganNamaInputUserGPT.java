/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buatfiledengannamainputusergpt;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BuatFileDenganNamaInputUserGPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama file yang ingin Anda buat (termasuk ekstensi .txt): ");
        String namaFile = scanner.nextLine();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile));

            System.out.println("Masukkan isi file teks (Ketik 'selesai' untuk mengakhiri):");
            String baris;
            while (true) {
                baris = scanner.nextLine();
                if (baris.equalsIgnoreCase("selesai")) {
                    break;
                }
                writer.write(baris);
                writer.newLine();
            }
            writer.close();
            System.out.println("File " + namaFile + " telah berhasil dibuat.");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat mencoba membuat file.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
   
