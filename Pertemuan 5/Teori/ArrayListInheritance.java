/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

public class ArrayListInheritance {
      public static void main(String args[]){
           Bunga bunga = new Bunga();
           System.out.println(bunga.sisaBunga());

           bunga.tambahBunga("Raflesia");
           bunga.tambahBunga("Tulip");
           bunga.tambahBunga("Matahari");
           System.out.println(bunga.sisaBunga());

           bunga.gantiBunga(1,"Melati");
           System.out.println(bunga.sisaBunga());

           bunga.bungaLayu(0);
           System.out.println(bunga.sisaBunga());
      }
}

class Taman_Bunga {
      ArrayList<String> flower = new ArrayList<>();

      public Taman_Bunga(){

      }
      public void setBunga(ArrayList<String> flower) {
            this.flower = flower;
      }
      public ArrayList<String> getBunga(){
            return this.flower;
      }
} 

class Bunga extends Taman_Bunga {
      public void tambahBunga(String flower){
            super.getBunga().add(flower);
      }
      public String bungaLayu(int index){
            return super.getBunga().remove(index);
      }
      public void gantiBunga(int index, String flower){
            super.getBunga().set(index, flower);
      }
      public ArrayList<String> sisaBunga(){
            return super.getBunga();
      }
}