/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.platformergame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author Reyvan
 */
public class Wall {
    int x;
    int y;
    int width;
    int height;
    int startX;
    
    Color color;
    
    Rectangle hitBox;
    public Wall(Color color,int x,int y,int width,int height){
        this.x=x;
        startX=x;
        this.y=y;
        this.color = color;
        this.width = width;
        this.height = height;
        
        hitBox = new Rectangle(x,y,width,height);
    }
    
    public void draw(Graphics2D gtd){
        gtd.setColor(Color.BLACK);
        gtd.drawRect(x,y,width,height);
        gtd.setColor(color);
        gtd.fillRect(x+1,y+1,width-2,height-2);
        
//        Font f = new Font("arial",Font.BOLD,40);
//        gtd.setFont(f);
//        gtd.drawString(Integer.toString(x),100,100);
        
    }
    
    public int set(int cameraX){
        x = startX +cameraX;
        hitBox.x = x;
        
        return x;
    }
}
