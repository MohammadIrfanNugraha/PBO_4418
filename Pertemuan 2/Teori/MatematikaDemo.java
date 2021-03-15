/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad Irfan Nugraha
 */
class matematika {

    int hasil = 0;
    int angka = 0;
  
    void pertambahan(int newAngka){
       hasil = angka + newAngka;
       System.out.println("\nPertambahan: "+ angka + " + " + newAngka + " = " + hasil);
    }
    void pengurangan(int newAngka) {
       hasil = angka - newAngka;
       System.out.println("\nPertambahan: "+ angka + " - " + newAngka + " = " + hasil);
    }
    void perkalian(int newAngka) {
       hasil = angka * newAngka;
       System.out.println("\nPertambahan: "+ angka + " * " + newAngka + " = " + hasil);
    }
    void pembagian(int newAngka) {
       hasil = angka / newAngka;
       System.out.println("\nPertambahan: "+ angka + " / " + newAngka + " = " + hasil);
    }
}

public class MatematikaDemo {
//  Main Method
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        matematika operator = new matematika();
//  penjumlahan
          operator.angka = 20;
          operator.pertambahan(20);
//  pengurangan
          operator.angka = 10;
          operator.pengurangan(5);
//  perkalian
          operator.angka = 10;
          operator.perkalian(20);
//  pembagian
          operator.angka = 20;
          operator.pembagian(2);
    }
}
