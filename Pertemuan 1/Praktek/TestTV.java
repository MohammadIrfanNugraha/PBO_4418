/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad Irfan Nugraha
 */
public class TestTV {
    int channel;
    int volumeLevel;
    boolean on;
    TestTV(){
    }
    
    void turnOn(boolean On){
        on = true;
    }
    void turnOff(boolean Off){
        on = false;
    }
    
    void setChannel(int newChannel){
        channel =newChannel;
    }
    
    void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
    
    void channelUp(){
        ++channel;
    }
    
    void channelDown(){
        --channel;
    }
    
    void volumeUp(){
        ++volumeLevel;
    }
    
    void volumeDown(){
        --volumeLevel;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        TestTV tv1 = new TestTV();
        tv1.turnOn(true);
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TestTV tv2 = new TestTV();
        tv2.turnOn(true);
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
