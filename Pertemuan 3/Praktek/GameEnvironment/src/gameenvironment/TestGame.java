/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenvironment;

/**
 *
 * @author Mohammad Irfan Nugraha
 */
public class TestGame {
    public static void main(String[] args) {
            GamePlayer demo  = new GamePlayer();
            demo.setPosition(30,50);
            demo.Run(60);
            demo.Run();
    }
}