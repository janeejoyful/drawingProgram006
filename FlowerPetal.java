// FlowerPetal.java
// This is for Project20bstv100.java
// Janee Yeak
// Superclass for Poppy and Rose

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class FlowerPetal
{
   private int x, y, len, wid;
   private Color flowerColor;
   
   public FlowerPetal(int xX, int yY, int lenN, int widD, Color c)
   {
      x = xX;
      y = yY;
      len = lenN;
      wid = widD;
      flowerColor = c;
   }
  
   public void drawPetal(Graphics2D g2d)
   {   
      g2d.setColor(flowerColor);
      g2d.fillOval(x, y, len, wid);     
   }
   
   public void drawPetalOutline(Graphics2D g2d)
   {   
      g2d.setColor(new Color(248, 200, 220));
      g2d.drawOval(x, y, len, wid);     
   }
   
   public void setX(int xX)  {    x = xX;       }
   public void setY(int yY)  {    y = yY;       }
   public void setL(int l)   {    len = l;      }
   public void setW(int w)   {    wid = w;      }
   public void setC(Color c) { flowerColor = c; }
   
   public int getX()   {    return x;        }
   public int getY()   {    return y;        }
   public int getL()   {    return len;      }
   public int getW()   {    return wid;      }
   public Color getC() { return flowerColor; } 

}
