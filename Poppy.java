// Poppy.java
// This is for Project20bstv100.java
// Janee Yeak

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Poppy extends FlowerPetal
{
   private int radius;
   private int stemX, stemY, stemL, stemW;
   private int pistilX, pistilY, pistilS;
   private Color stemC;
   
   public Poppy(int xX, int yY, int lenN, int widD, Color c)  
   {
      super(xX, yY, lenN, widD, c);
      radius = lenN / 2;
      
      stemC = new Color(0,93,50);
      stemW = lenN/5;
      stemL = lenN*2-stemW;
      stemX = (lenN-stemW)/2 + xX;
      stemY = yY + lenN - 5;
      
      pistilS = lenN/3;
      pistilX = xX + pistilS;
      pistilY = yY + pistilS;
   } 
            
   public void drawFlower(Graphics2D g2d)
   {
        drawStem(g2d);
        super.drawPetal(g2d);
        drawPistil(g2d);
   }
   
   public void drawStem(Graphics2D g2d)
   {
      g2d.setColor(stemC);
      g2d.fillRect(stemX, stemY, stemW, stemL); // Stem
   }
   
   public void drawPistil (Graphics2D g2d)
   {     
      g2d.setColor(Color.black);
      g2d.fillOval(pistilX, pistilY, pistilS, pistilS);
   }
   
}
  