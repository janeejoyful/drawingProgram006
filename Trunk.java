// Trunk.java
// This is for Project20bstv100.java
// Janee Yeak

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Trunk
{
   private int x, y, length, width;       
   private Color treeColor;
   
   public Trunk(int xX, int yY, int length123) 
   {
      x = xX;
      y = yY;
      length = length123;
      width = length / 3 - 15;
      treeColor = new Color (152,105,96);

   }
  
   public void drawTrunk(Graphics2D g2d)
   { 
      g2d.setColor(treeColor);
      g2d.fillRect(x, y, width, length);   
   }   

}
