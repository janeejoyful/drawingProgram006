// Border.java
// This is for Project20bstv100.java
// Janee Yeak
// This class draws a border around the painting.

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.geom.*;

public class Border
{
   private int x1, y1, x2, y2;                  // passed parameters          # 1
   private Color aqua, lavender, lightSkyBlue;  // Some colours               # 2

   public Border(int xX, int yY, int xxx, int yyy) 
   {
      x1 = xX;
      y1 = yY;
      x2 = xxx;
      y2 = yyy;
      aqua = new Color(175, 238, 238);
      lavender = new Color(220, 224, 255);
   }
  
   public void drawBorder(Graphics2D g2d)
   {  
      
      Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
      g2d.setStroke(dashed);
      
      int a = x1;
      int b = x2;
      int c = y1 - 15;
      int d = y1 - 15;
      
      for (int i = 0; i < 4; i++)
      {
    
         if(i % 2 == 0)
            g2d.setColor(aqua);
         else
            g2d.setColor(lavender);
         
         g2d.drawLine(a, c, b, d);
         
         c+=5;
         d+=5;
      }
      
      c = y1 - 15;
      d = y2 - 15;
      
      for (int i = 0; i < 4; i++)
      {
    
         if(i % 2 == 0)
            g2d.setColor(aqua);
         else
            g2d.setColor(lavender);
         
         g2d.drawLine(a, c, a, d);
         
         a+=5;
      }
      
      a = x1;
      
      for (int i = 0; i < 4; i++)
      {
    
         if(i % 2 == 0)
            g2d.setColor(aqua);
         else
            g2d.setColor(lavender);
         
         g2d.drawLine(a, d, b, d);
         
         d+=5;
      }

      d = y2 - 15; 
           
      for (int i = 0; i < 4; i++)
      {
    
         if(i % 2 == 0)
            g2d.setColor(aqua);
         else
            g2d.setColor(lavender);
         
         g2d.drawLine(b, d, b, c);
         
         b+=5;
      }



   }
   
}
