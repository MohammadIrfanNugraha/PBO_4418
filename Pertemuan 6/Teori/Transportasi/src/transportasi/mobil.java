/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportasi;

/**
 *
 * @author Mohammad Irfan Nugraha
 */
public class mobil {
    String warna;
    int tahun = 2001;
    
    public mobil() {

    }
    
    public mobil(String color, int thn) {
        this.warna = color;
        this.tahun = thn;
    }
    
    public String getwarna() {
        return warna;
    }
    public int gettahun() {
        return tahun;
    }
}