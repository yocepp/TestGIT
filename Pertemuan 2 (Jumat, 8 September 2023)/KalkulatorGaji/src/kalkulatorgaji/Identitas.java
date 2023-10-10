/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorgaji;

/**
 *
 * @author ASUS
 */
public class Identitas {
    String nama;
    double gaji;
    
    public Identitas (String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public String namaUser (){
        return this.nama;
    }
    
    public double gajiPokok (){
        return this.gaji;
    }
}
