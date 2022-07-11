/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platformergame;

import java.awt.Dimension;
import java.awt.Toolkit;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Reyvan
 */
public class PlatformerGameCall {
    MainFrame mainframe;
    Menu menu;
    //menu disini hanya dipakai untuk fungsi destroy
    public PlatformerGameCall(String username, Menu menu){
        this.menu = menu;
        
        this.mainframe = new MainFrame(username, this);
        this.mainframe.setSize(700,700);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.mainframe.setLocation((int)(screenSize.getWidth()/2-this.mainframe.getSize().getWidth()/2),(int)(screenSize.getHeight()/2-this.mainframe.getSize().getHeight()/2));
        this.mainframe.setResizable(false);
        this.mainframe.setTitle("Platformer Games");
        this.mainframe.setVisible(true);
        
        this.mainframe.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
     public void destroy(){
        menu.updateTable();
        menu.setVisible(true);
        mainframe.setVisible(false);
    }
}
