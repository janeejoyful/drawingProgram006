// FlowerLeaf.java
// This is for Project20bstv100.java
// Janee Yeak
// Has Composition with Rose, this class drawing the leaves for the Rose.

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class FlowerLeaf
{
   private int originalX, originalY;
   private int x, y, len, wid;
   private Color leafColor;
   private boolean horizontal;
   private Polygon tipLeaf;
   
   public FlowerLeaf(int xX, int yY, int lenN, int widD, Color c, boolean h) 
   {
      x = xX;
      y = yY;
      originalX = xX;
      originalY = yY;
      len = lenN;
      wid = widD;
      leafColor = c; 
      horizontal = h;     
   }
  
   public void drawLeaf(Graphics2D g2d)
   { 
      drawLeafBody(g2d);
      drawLeafBodyOutline(g2d);
      drawTipLeaf(g2d);     
      drawTipLeafOutline(g2d);
      drawLeafVein(g2d);
   }
   
   private void drawLeafBodyOutline(Graphics2D g2d)
   {   
      g2d.setColor(new Color(24, 85, 18));
      
      Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
      g2d.setStroke(dashed);
      
      if (horizontal)
         g2d.drawOval(x, y, len, wid);   
      else
         g2d.drawOval(x, y, wid, len);  
   }
   
   private void drawLeafBody(Graphics2D g2d)
   {
      g2d.setColor(leafColor);
      
      if (horizontal)
           g2d.fillOval(x, y, len, wid);      
      else
         g2d.fillOval(x, y, wid, len);   
   }
   
   private void drawTipLeaf(Graphics2D g2d)
   {
      g2d.setColor(leafColor); 
      
      if (horizontal)
      { 
         tipLeaf = new Polygon();
         tipLeaf.addPoint(x+(len/2)-75, y+17);
         tipLeaf.addPoint(x+(len/2)-75, y+wid-17);
         tipLeaf.addPoint(x-30, y+(wid/2));
         
         g2d.fillPolygon(tipLeaf);
      }
      else 
      {    
         tipLeaf = new Polygon();
         tipLeaf.addPoint(x+15, y+len-45);
         tipLeaf.addPoint(x+wid-15, y+len-45);
         tipLeaf.addPoint(x+(wid/2), y+len+30);
         
         g2d.fillPolygon(tipLeaf);
      } 
   }
   
   private void drawTipLeafOutline(Graphics2D g2d)
   {        
      Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
      g2d.setStroke(dashed);
      
      g2d.setColor(new Color(24, 85, 18));
      
      if (horizontal)
      {
        g2d.drawLine(x+(len/2)-75, y+17,x-30, y+(wid/2));     // left
        g2d.drawLine(x+(len/2)-75, y+wid-17,x-30, y+(wid/2)); // right
      }
      else 
      {
         g2d.drawLine(x+15, y+len-45, x+(wid/2), y+len+30);     //left
         g2d.drawLine(x+wid-15, y+len-45, x+(wid/2), y+len+30); //right
      }
   }
   
   private void drawLeafVein(Graphics2D g2d)
   {
      g2d.setColor(new Color(90, 155, 44));
      
      if(horizontal) 
         g2d.drawLine(x-30, y+(wid/2), x+len, y+(wid/2));           
      
      else
         g2d.drawLine(x+(wid/2), y, x+(wid/2), y+len+30); 

   }
  
}
