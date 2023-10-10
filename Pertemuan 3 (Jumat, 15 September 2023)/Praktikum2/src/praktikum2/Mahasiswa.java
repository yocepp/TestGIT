/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2;
import java.io.Serializable;
/**
 *
 * @author ASUS
 */
public class Mahasiswa implements Serializable{
       String nama;
       int id;
       double ipk;
       
       public Mahasiswa(String nama, int id, double ipk){
           this.nama = nama;
           this.id = id;
           this.ipk = ipk;
           
       }
       @Override
       public String toString(){
           return "Mahasiswa{" + "nama=" + nama + ",id=" + id + ",ipk=" + ipk + '}';
       }
}
