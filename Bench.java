// Bench.java
// This is for Project20bstv100.java
// Janee Yeak
// This class draws the bench that the bear is sitting on

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Bench
{
   private int x, y, length, width;       
   private Polygon parallelogram;
   private Color lavender, lightPurple;
   
   public Bench(int xX, int yY, int length123) 
   {
      x = xX;
      y = yY;
      length = length123;
      width = length / 10 + 5;
      parallelogram = new Polygon();  // for the seat of the bench.
      lavender = new Color (196, 186, 255);
      lightPurple = new Color (170, 96, 228);
   }
  
   public void drawBench(Graphics2D g2d)
   {   
      g2d.setColor(lavender);
      
      g2d.fillRect(x, y-100, length, 100); // back
       
      parallelogram.addPoint(x, y);              // top left corner
      parallelogram.addPoint(x+length, y);       // top right corner
      parallelogram.addPoint(x+length+15, y+30); // bottom right corner
      parallelogram.addPoint(x+15, y+30);        // bottom left corner
      g2d.fillPolygon(parallelogram);            // seat
      
      g2d.fillRect(x, y, 16, 70);
      g2d.fillRect(x+length-16,y, 16, 70);
      g2d.fillRect(x+length-1, y+30, 16, 70); 
      g2d.fillRect(x+15, y+30, 16, 70);
      
  ///////////// Outlining the Bench //////////////
      
      g2d.setColor(lightPurple);
      
      g2d.drawRect(x, y-100, length, 100); // back    
      
      g2d.drawRect(x, y, 16, 70);
      g2d.drawRect(x+length-16,y, 16, 70);
      g2d.drawRect(x+length-1, y+30, 16, 70); 
      g2d.drawRect(x+15, y+30, 16, 70);
      
      g2d.setColor(lavender);
      g2d.fillPolygon(parallelogram);
      
      g2d.setColor(lightPurple); 
      g2d.drawPolygon(parallelogram);
   }
   
      

}
