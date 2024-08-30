// Display.java
// This is for Project20bstv100.java
// Janee Yeak

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Display extends JPanel
{
   String message123;

   public Display() // Constructor.
   {
      setLayout(null);
      
       message123 = JOptionPane.showInputDialog("This program displays a Bible Verse. Please Enter a Bible verse below (with or without citation). \n There is a limit of about 18 words. Anything after that will be ignored."); 
  }
   		
   public void	paintComponent(Graphics g)
   {
      super.paintComponent(g); 
      Graphics2D g2d = (Graphics2D)g;
      
      g2d.setColor(Color.white);
      g2d.fillRect(0, 0, 1024, 768);
      
      /////////// Normal lines ////////
      
      Sky s = new Sky(50, 50, 925, 700); 
      s.drawSky(g2d);
      
      Sun sun = new Sun(900, 50, 600);
      sun.drawSun(g2d);
      
      Tree t = new Tree(100, 350, 300, 85);
      t.drawTree(g2d);
      
      Grass gra = new Grass(70, 595, 850);
      gra.drawGrass(g2d);
      
      Bench ben = new Bench (235, 550, 200);
      ben.drawBench(g2d);
      
      Bear b = new Bear (300, 400, 70); 
      b.drawBear(g2d);
      
      ////////// Covering up anything that went beyond the borders ///////
             
      g2d.setColor(Color.white);
      
      g2d.fillRect(0, 0, 69, 768); // left side
      g2d.fillRect(0, 0, 1024, 50); // top
      g2d.fillRect(925, 0, 1024, 768); // right
      g2d.fillRect(0, 720, 1024, 768); // bottom 
      
     
      Poppy p1 = new Poppy(800, 500, 50, 50, new Color (227, 83, 53)); // Poppy red. Poppy 1 Middle Poppy
      p1.drawFlower(g2d);
      
      Poppy p2 = new Poppy(750, 525, 50, 50, new Color (227, 83, 53)); // Poppy red. Poppy 2 Left Poppy
      p2.drawFlower(g2d);
      
      Poppy p3 = new Poppy(850, 525, 50, 50, new Color (227, 83, 53)); // Poppy red. Poppy 3 Right Poppy
      p3.drawFlower(g2d);
       
      /////////// Dotted lines //////// 
            
      Border bor = new Border(50, 50, 925, 700); 
      bor.drawBorder(g2d);
      
      Rose ro = new Rose(800, 0, 125, 125, Color.red);
      ro.drawRose(g2d); 
      
      Message mess = new Message(400, 300, message123);
      mess.printMessage(g2d);
   
     
   }
}
