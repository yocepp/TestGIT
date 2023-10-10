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
public class Kubus extends KelasAbstractAtribute implements LuasAlas, LuasPermukaan {
    
    //constructor
    Kubus(double s) {
        this.sisi = s;
    }
    
    @Override
    public void printResult() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println("Hasil luas perumkaan kubus adalah " + this.luasPermukaan());
        System.out.println("Hasil luas alas kubus adalah " + this.luasAlas());
    }

    @Override
    public double luasAlas() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.sisi * this.sisi;
    }

    @Override
    public double luasPermukaan() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 4 * (this.sisi * this.sisi);
    }
}
