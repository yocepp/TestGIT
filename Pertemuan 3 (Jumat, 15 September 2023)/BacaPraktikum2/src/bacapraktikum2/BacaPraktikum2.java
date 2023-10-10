/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bacapraktikum2;
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
public class BacaPraktikum2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Specify the path to the binary file you want to read
        String filePath = "Object.bin";

        try {
            // Create a FileInputStream object
            FileInputStream inputStream = new FileInputStream(filePath);

            // Create a byte array to store the read data
            byte[] buffer = new byte[1024];

            int bytesRead;

            // Read binary data from the file and store it in the buffer
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                // Process the data as needed
                // In this example, we will print the bytes as integers
                for (int i = 0; i < bytesRead; i++) {
                    int intValue = buffer[i] & 0xFF;
                    System.out.print(intValue + " ");
                }
            }

            // Close the FileInputStream
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

  
    

