/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Praktikum2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
        mhs.add(new Mahasiswa("Andi",1,3.25));
        mhs.add(new Mahasiswa("Budi",2,4));
        mhs.add(new Mahasiswa("Charlie",3,2.25));;
        
        for (Mahasiswa m : mhs){
            System.out.println(m);
        }
        File filenya = new File("Objek.bin");
        try {
            FileOutputStream writer = new FileOutputStream(filenya);
            ObjectOutputStream objek = new ObjectOutputStream(writer);
            for (Mahasiswa m : mhs){
                objek.writeObject(m);
            
            }
            objek.close();
            System.out.println("Selesai menyimpan file");
         
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
}
