// Leaves.java
// This is for Project20bstv100.java
// Janee Yeak

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Leaves // Leaves for the tree!
{
   private int x, y, height, width, radius;       
   private Color leafColor;
   
   public Leaves(int xX, int yY, int length123, int rad) 
   {
      x = xX;
      y = yY;
      height = length123;
      width = height / 3 - 15;
      leafColor = new Color(46,139,87);
      radius = rad;
   }
  
   public void drawLeaves(Graphics2D g2d)
   { 
      g2d.setColor(leafColor);
      
      g2d.fillOval((width / 2)+15, (height / 2) - radius+50, radius * 2, radius * 2);
      g2d.fillOval((width / 2)+15, (height / 2)+50, radius * 2, radius * 2);
      g2d.fillOval((width / 2)+15 - radius , (height / 2)+50, radius * 2, radius * 2);
      g2d.fillOval((width / 2)+15 + radius, (height / 2)+50, radius * 2, radius * 2);
      
      g2d.setColor(Color.white);
      g2d.fillRect(0, 0, 69, 700); // Some of the leaves stick out of the frame I want it to be in.

   }   

}
