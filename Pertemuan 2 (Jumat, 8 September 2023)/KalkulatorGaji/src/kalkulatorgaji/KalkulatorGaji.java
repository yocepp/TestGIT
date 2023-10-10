/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulatorgaji;
import kalkulatorgaji.Interface.*;

/**
 *
 * @author ASUS
 */
public class KalkulatorGaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Identitas P1 = new Identitas("Yosef", 500000);
        
        GajiBonus staff = new GajiBonusStaff();
        GajiBonus dosen = new GajiBonusDosen();
        
        LaporanIdentitas LP = new LaporanIdentitas(P1);
        
        JembatanHitungBonus JHB1 = new JembatanHitungBonus(gajiBonusDosen);
        
    }
    
}
