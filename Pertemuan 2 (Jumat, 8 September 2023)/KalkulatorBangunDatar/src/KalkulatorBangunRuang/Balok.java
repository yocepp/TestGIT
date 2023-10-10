    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KalkulatorBangunRuang;
import Interface.*;

/**
 *
 * @author ASUS
 */
public class Balok extends KelasAbstractAtribute implements LuasAlas, LuasPermukaan, Volume {

    
    //constructor
    Balok(double p, double l, double t) {
        this.panjang = p;
        this.Lebar = l;
        this.Tinggi = t;
    }
    
    @Override
    public void printResult() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Hasil luas perumkaan balok adalah " + this.luasPermukaan());
        System.out.println("Hasil volume balok adalah " + this.volume());
        System.out.println("Hasil luas alas balok adalah " + this.luasAlas());
    }

    @Override
    public double luasAlas() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.panjang * this.Lebar;
    }

    @Override
    public double luasPermukaan() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return 2 * ((this.panjang*this.Lebar ) + (this.panjang*this.Tinggi) + this.Lebar + this.Tinggi);
    }

    @Override
    public double volume() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return this.panjang * this.Lebar * this.Tinggi;
    }
    
}
