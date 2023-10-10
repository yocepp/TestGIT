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
public class LaporanIdentitas implements Laporan {
    private Identitas identitas;
    
    public LaporanIdentitas(Identitas identitas){
        this.identitas = identitas;
    }
    
    @Override
    public String buatLaporan() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    return "Nama: " + this.identitas.namaUser() + "Gajinya: Rp. " + this.identitas.gajiPokok();
    }
    
}
