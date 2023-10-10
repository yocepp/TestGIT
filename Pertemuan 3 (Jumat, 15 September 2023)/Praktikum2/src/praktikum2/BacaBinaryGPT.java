/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class BacaBinaryGPT {
    public static void main(String[] args) {
        String fileName = "Objek.bin"; // Ganti dengan nama file biner yang ingin Anda baca

        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            int data;
            int bytesRead = 0;

            System.out.println("Konten file biner dalam format heksadesimal:");

            while ((data = inputStream.read()) != -1) {
                System.out.printf("%02X ", data); // Menampilkan byte dalam format heksadesimal
                bytesRead++;

                // Tambahkan baris baru setiap 16 byte
                if (bytesRead % 16 == 0) {
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
