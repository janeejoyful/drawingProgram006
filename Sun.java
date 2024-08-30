// Sun.java
// This is for Project20bstv100.java
// Janee Yeak

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Sun
{
   private int x, y, x2, y2, radius;       
   private Color tomato, red, oranged, yellow, amber, marigold, orangePeel, flameOrange; // 8 colours in total
   
   public Sun(int xX, int yY, int rad) 
   {
      x = xX;
      y = yY;
      x2 = xX - rad;
      y2 = yY;
      radius = rad;
      tomato = new Color (255,99,71);
      red = new Color (255, 0, 0); // really just normal red.
      oranged = new Color (255, 69, 0);
      yellow = new Color (255, 255, 0); // normal yellow
      amber = new Color (252, 138, 23);
      orangePeel = new Color (255,159,0);
      marigold = new Color (235,168,50);
      flameOrange = new Color (252,138,23);
   }
  
   public void drawSun(Graphics2D g2d)
   {
      int angle = 0;
      
      for (int i = 1; i <500; i++)
      {
          Color myColor = chooseC(i);
          g2d.setColor(myColor);
          
          int xEnd = (int) (x + (Math.cos(angle) * radius));
          int yEnd = (int) (y + (Math.sin(angle) * radius));
          
          g2d.drawLine(x, y, xEnd, yEnd);
          
          angle+=1;
      }
       
   }
   
   private Color chooseC(int no)
   {
      if (no % 8 == 0)
         return flameOrange;
      else if (no % 8 == 1)
         return marigold;
      else if (no % 8 == 2)
         return orangePeel;
      else if (no % 8 == 3)
         return amber;
      else if (no % 8 == 4)
         return yellow;
      else if (no % 8 == 5)
         return oranged;
      else if (no % 8 == 6)
         return red;
      else if (no % 8 == 7)
         return tomato;
      else 
         return red;
   }   

}
