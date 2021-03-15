/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad Irfan Nugraha
 */
class Mobil2 {

    String warna;
    int tahunproduksi;
    boolean on = false ;
    int ubahGigi;
    

    void HidupkanMobil() {
       on = true;
    }
    void MatikanMobil() {
        on = false;
    }
    void ChangeGigi(int newGigi) {
        ubahGigi = newGigi;
    }
}

public class mobildemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Mobil2 mobilku1 = new Mobil2();
        mobilku1.warna = " Merah ";
        mobilku1.tahunproduksi = 2016 ;
        mobilku1.HidupkanMobil();
        mobilku1.ChangeGigi(3);

        Mobil2 mobilku2 = new Mobil2();
        mobilku2.warna = " Putih ";
        mobilku2.tahunproduksi = 2020 ;
        mobilku2.MatikanMobil();
        mobilku2.ChangeGigi(2);
        
        System.out.println(" Keadaan: " + mobilku1.on);
        System.out.println(" Warna: " + mobilku1.warna);
        System.out.println(" Tahun: " + mobilku1.tahunproduksi);
        System.out.println(" Ganti Gigi:  " + mobilku1.ubahGigi);
        System.out.println(" ");
        System.out.println(" Keadaan: " + mobilku2.on);
        System.out.println(" Warna: " + mobilku2.warna);
        System.out.println(" Tahun: " + mobilku2.tahunproduksi);
        System.out.println(" Ganti Gigi:  " + mobilku2.ubahGigi);
    }
}
