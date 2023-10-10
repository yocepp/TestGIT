/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;

/**
 *
 * @author ASUS
 */
public class BacaBinaryPakTOTO {
    public static void main(String[] pArgs) throws IOException, ClassNotFoundException {
        String fileName = "Objek.bin";
        File file = new File(fileName);
        FileInputStream fstream = new FileInputStream(fileName);
        try {
            ObjectInputStream ostream = new ObjectInputStream(fstream);
            while (true) {
                Object obj;
                try {
                    obj = ostream.readObject();
                } catch (EOFException e) {
                    break;
                }
                System.out.println(obj.toString());
            }
        } finally {
            fstream.close();
        }

    }
    
}
