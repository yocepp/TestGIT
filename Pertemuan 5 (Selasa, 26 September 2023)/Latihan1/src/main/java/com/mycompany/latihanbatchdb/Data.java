/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanbatchdb;

/**
 *
 * @author ASUS
 */
class Data {
    private String id;
    private String vendor;
    private String tipe;
    private String mesin;
    private String maxSpeed;
    
    public Data(String id, String vendor, String tipe, String mesin, String maxSpeed){
        this.id = id;
        this.vendor = vendor;
        this.tipe = tipe;
        this.mesin = mesin;
        this.maxSpeed = maxSpeed;
    }
    public String getKolom1(){
        return id;
    }
    
    public String getKolom2(){
        return vendor;
    }
    public String getKolom3(){
        return tipe;
    }
    public String getKolom4(){
        return mesin;
    }
    public String getKolom5(){
        return maxSpeed;
    }
}
