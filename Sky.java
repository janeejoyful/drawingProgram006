// Sky.java
// This is for Project20bstv100.java
// Janee Yeak
// This class draws a simple background for the painting.

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Sky
{
   private int x1, y1, x2, y2, length, width;       
   private Color lightSkyBlue;
   
   public Sky(int xX, int yY, int xxx, int yyy)
   {
      x1 = xX;
      y1 = yY;
      x2 = xxx;
      y2 = yyy;
      lightSkyBlue = new Color(208, 236, 253);
   }
  
   public void drawSky(Graphics2D g2d)
   { 
      g2d.setColor(lightSkyBlue);
      g2d.fillRect(x1+20, y1+5, x2-x1-25, y2-y1-25);
   }
   
      

}
