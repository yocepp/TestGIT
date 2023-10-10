/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Manajemen File");
        System.out.println("1.  Buat file");
        System.out.println("2.  Ubah nama file");
        System.out.println("3.  Hapus file");
        System.out.println("4.  Keluar");
        
        while(true){
            System.out.println("========================== \n ");
            System.out.print("Masukan perintah: ");
            Integer pilihan = scanner.nextInt();
            scanner.nextLine();
            
            if (pilihan == 1){
                System.out.print("Buat nama file (tambah .txt): ");
                String fileBaru = scanner.nextLine();
                
                System.out.print("Isi file: ");
                String isi = scanner.nextLine();
                
                try{
                    FileWriter writer = new FileWriter(fileBaru);
                    writer.write(isi);
                    writer.close();
                    System.out.print("File " + fileBaru + "berhasil dibuat\n");
                    
                }
                catch (IOException e){
                    System.out.println("Ada kesalahan dalam membuat file " + fileBaru);
                    e.printStackTrace();
                }
            }
            else if (pilihan == 2){
                    System.out.print("Nama file yang akan diubah: ");
                    String namaFileLama = scanner.nextLine();
                    
                    System.out.print("Nama file yang baru: ");
                    String namaFileBaruNew = scanner.nextLine();
                    
                    File fileLama = new File(namaFileLama);
                    File fileBaruNew = new File (namaFileBaruNew);
                    
                    if(fileLama.exists() && fileLama.isFile()){
                        if (fileLama.renameTo(fileBaruNew)){
                            System.out.println("File " + namaFileLama + " berhasil diubah menjadi " + namaFileBaruNew);
                        }
                        else {
                            System.out.println("Gagal mengganti nama file " + namaFileLama);
                        }
                    }
            }
            else if (pilihan == 3){
                    System.out.print("Nama file yang akan dihapus: ");
                    String namaFileDel = scanner.nextLine();
                    
                    File fileDel = new File (namaFileDel);
                    
                    if(fileDel.exists() && fileDel.isFile()){
                        if (fileDel.delete()){
                            System.out.println("File berhasil dihapus");
                        }
                        else{
                            System.out.println("Gagal menghapus file " + namaFileDel);
                        }
                    }
                    else{
                        System.out.println("File " + namaFileDel + "tidak ada"); 
                    }
            }
            else if (pilihan == 4){
                    System.out.println("Sampai Jumpa!!!");
                    scanner.close();
                    System.exit(0);
                    break;
                    
            }
            else{
                System.out.println("Tidak ada dimenu!!!");
            }
        }
    }
}