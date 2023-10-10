/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorgaji;
import kalkulatorgaji.Interface.*;

/**
 *
 * @author ASUS
 */
public class GajiBonusDosen implements GajiBonus {

    @Override
    public double hitungBonus(Identitas identitas) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return identitas.gaji * 0.8;
    }
    
}
