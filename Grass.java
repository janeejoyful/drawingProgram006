// Grass.java
// This is for Project20bstv100.java
// Janee Yeak

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Grass
{
   private int x, y, length, width;       
   private Color grassColor;
   
   public Grass(int xX, int yY, int length123) 
   {
      x = xX;
      y = yY;
      length = length123;
      width = length / 10;
      grassColor = new Color (34,139,34);
   }
  
   public void drawGrass(Graphics2D g2d)
   { 
      g2d.setColor(grassColor);
      g2d.fillRect(x, y, length, width);
   }
   
      

}
