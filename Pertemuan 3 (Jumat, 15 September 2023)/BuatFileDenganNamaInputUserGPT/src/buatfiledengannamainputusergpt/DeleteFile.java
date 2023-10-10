/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buatfiledengannamainputusergpt;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DeleteFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama file yang ingin Anda hapus (termasuk ekstensi .txt): ");
        String namaFile = scanner.nextLine();

        File file = new File(namaFile);

        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("File " + namaFile + " telah berhasil dihapus.");
            } else {
                System.err.println("Gagal menghapus file " + namaFile + ".");
            }
        } else {
            System.err.println("File " + namaFile + " tidak ditemukan.");
        }

        scanner.close();
    }
    
    
}
