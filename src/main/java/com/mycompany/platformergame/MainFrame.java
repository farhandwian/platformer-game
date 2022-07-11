/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platformergame;

import java.awt.Color;

/**
 *
 * @author Reyvan
 */
public class MainFrame extends javax.swing.JFrame {
    private String username;
    private PlatformerGameCall platformGame;
    //platform game disini hanya dipakai untuk destroy
    
    public MainFrame(String username, PlatformerGameCall platformGame){
        this.platformGame = platformGame;
        this.username = username;
        
        GamePanel panel = new GamePanel(this.username, this);
        panel.setLocation(0,0);
        panel.setSize(this.getSize());
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setVisible(true);
        this.add(panel);
        
        addKeyListener(new KeyChecker(panel));
    }
    
     public void destroy(){
        this.platformGame.destroy();
        this.dispose();
     }
}
