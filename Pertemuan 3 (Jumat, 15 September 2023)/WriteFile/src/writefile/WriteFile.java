/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package writefile;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

        

/**
 *
 * @author ASUS
 */
public class WriteFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File filenya = new File("Plaintext.txt");
        FileWriter writer = null;
        try {
                writer = new FileWriter(filenya);
                BufferedWriter bw = new BufferedWriter (writer);
                bw.write("Ini adalah Judul");
                bw.newLine();
                bw.write("Ini adalah paragraf 1 \n");
                bw.write("Ini adalah paragraf 2 \n");
                bw.close();
                System.out.println("Selesai menulis file");
                
        }catch (IOException ex){
            ex.printStackTrace();
        }
        
    }
    
}
