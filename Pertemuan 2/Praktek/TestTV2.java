/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad Irfan Nugraha
 */
class Manusia {
   private String nama;
   private boolean punyaTV;
   
    Manusia (){
    }
    public Manusia(String nama) {
       this.nama  = nama;
    }
    public String namaSaya () {
       return nama;
    }
    public void beliTV(TV tiviku) {
       punyaTV = true;
       System.out.println(punyaTV);
    }
    public void jualSemuaTV() {
       punyaTV = false;
       System.out.println(punyaTV);
    }
    boolean cekTV() {
        return punyaTV;
    }   
}
class TV {

    int channel; 
    
    int volumeLevel;
    
    boolean on = false;
    
        
    public TV(){}
    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }
    
    public void setChannel(int newChannel){
        channel = newChannel;
    }
    
    public void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
    
    public void channelUp() {
        ++channel ;
    }
    
    public void channelDown() {
        --channel;
    }
    
    public void volumeUp() {
        ++volumeLevel;
    }
    
    public void volumeDown() {
        --volumeLevel ;
    }
}

public class TestTV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia ma1 = new Manusia("Erik");
        System.out.println(ma1.namaSaya());
        TV tvku = new TV();
        ma1.beliTV(tvku);
        ma1.jualSemuaTV();
    }
}