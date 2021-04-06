/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;

public class StackInheritance {
      public static void main(String args[]){
            Bunga bunga = new Bunga();
            System.out.println(bunga.sisaBunga());
 
            bunga.tambahBunga("Mawar");
            bunga.tambahBunga("Melati");
            bunga.tambahBunga("Lavender");
            System.out.println(bunga.sisaBunga());
 
            bunga.gantiBunga(2,"Kamboja");
            System.out.println(bunga.sisaBunga());
 
            bunga.bungalayu();
            System.out.println(bunga.sisaBunga());
      }
}
 
class Taman_Bunga {
      Stack<String> flower = new Stack<String>();
 
      public Taman_Bunga(){
 
      }
      public void setBunga(Stack<String> flower) {
            this.flower = flower;
      }
      public Stack<String> getBunga(){
            return this.flower;
      }
} 
 
class Bunga extends Taman_Bunga {
      public void tambahBunga(String flower){
            super.getBunga().push(flower);
      }
      public String bungalayu(){
            return super.getBunga().pop();
      }
      public void gantiBunga(int index,String flower){
            super.getBunga().set(index, flower);
      }
      public Stack<String> sisaBunga(){
            return super.getBunga();
      }
}