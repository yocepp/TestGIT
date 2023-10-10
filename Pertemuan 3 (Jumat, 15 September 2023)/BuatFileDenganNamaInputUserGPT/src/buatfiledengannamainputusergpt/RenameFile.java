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
public class RenameFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama file yang ingin Anda ubah namanya (termasuk ekstensi .txt): ");
        String namaFileLama = scanner.nextLine();

        System.out.print("Masukkan nama baru untuk file (jangan lupa tambah .txt): ");
        String namaFileBaru = scanner.nextLine();

        File fileLama = new File(namaFileLama);
        File fileBaru = new File(namaFileBaru);

        if (fileLama.exists() && fileLama.isFile()) {
            if (fileLama.renameTo(fileBaru)) {
                System.out.println("File " + namaFileLama + " telah berhasil diubah namanya menjadi " + namaFileBaru + ".");
            } else {
                System.err.println("Gagal mengubah nama file " + namaFileLama + ".");
            }
        } else {
            System.err.println("File " + namaFileLama + " tidak ditemukan.");
        }

        scanner.close();
    }
    
}