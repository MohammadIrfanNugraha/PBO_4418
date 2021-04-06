/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Queue;
import java.util.LinkedList;
public class QueueInheritance {
      public static void main(String args[]){
            Kendaraan mobil = new Kendaraan();
            System.out.println(mobil.stokmobil());
 
            mobil.tambahmobil("Avanza");
            mobil.tambahmobil("Agya");
            mobil.tambahmobil("Innova");
            mobil.tambahmobil("Alphard");
            mobil.tambahmobil("Calya");
            System.out.println(mobil.stokmobil());
 
            mobil.mobilrusak(3);
            System.out.println(mobil.stokmobil());
      }      
}

class Perusahaan_Mobil {
      Queue<String> car = new LinkedList<String>();
 
      public Perusahaan_Mobil(){
 
      }
      public void setmobil(Queue<String> car) {
            this.car = car;
      }
      public Queue<String> getmobil(){
            return this.car;
      }
}

class Kendaraan extends Perusahaan_Mobil {
      public void tambahmobil(String car){
            super.getmobil().add(car);
      }
      public void mobilrusak(int index){
            System.out.println(super.getmobil().poll());
      }
      public Queue<String> stokmobil(){
            return super.getmobil();
      }
} 
