// Rose.java
// This is for Project20bstv100.java
// Janee Yeak
// Rose.java uses both inheritance and composition; Composition with the FlowerLeaf class, and inheritance
// With the FlowerPetal class. 

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Rose extends FlowerPetal
{
   private Color roseC = new Color (248, 200, 220);
   private int xxx, yyy, lll, www;
   private FlowerLeaf flV, flH; // V = vertical; H = horizontal
   
   public Rose(int xX, int yY, int lenN, int widD, Color c)  
   {
      super(xX, yY, lenN, widD, c);
      xxx = xX;
      yyy = yY;
      lll = lenN;
      www = widD;
      
      flV = new FlowerLeaf(xX-10, yY+180, 235, 165, new Color(35, 128, 4), false);
      flH = new FlowerLeaf(xX-210, yY+35, 235, 165, new Color(35, 128, 4), true);   

   } 
            
   public void drawRose(Graphics2D g2d)
   {
      flH.drawLeaf(g2d);
      flV.drawLeaf(g2d);

      drawPetals(g2d);          // This is not the method in the superclass; That one is 
      drawPetalsOutline(g2d);   // "drawPetal"; This one is "drawPetals"
 
   }
   
   public void drawPetals(Graphics2D g2d)
   {
      setX(xxx);
      setY(yyy);
      setL(lll);
      setW(www);
      setC(Color.red);
      
      Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
      g2d.setStroke(dashed);
           
      
      for (int i = 1; i <= 2; i++)
      {
         setX(getX()+40);
         setY(getY()+30);
         setL(getL()-2);
         setW(getW()-2);
         
         if (i == 2)
            setX(getX()-20);
            
         super.drawPetal(g2d);
      }
      
      setX(getX()+20);
      
      for (int i = 1; i <= 2; i++)
      {
         setX(getX()-40);
         setY(getY()+30);
         setL(getL()+ 2);
         setW(getW()+ 2);
         
         if (i == 2)
            setX(getX()+20);
            
         super.drawPetal(g2d);
      }
      
      setX(getX()-20);
      
      for (int i = 1; i <= 2; i++)
      {
         setX(getX()-40);
         setY(getY()-30);
         setL(getL()- 2);
         setW(getW()- 2);
         
         if (i == 2)
            setX(getX()+20);
            
         super.drawPetal(g2d);
      }
      
      setX(getX()-20);
      
      for (int i = 1; i <= 2; i++)
      {
         setX(getX()+40);
         setY(getY()-30);
         setL(getL()+ 2);
         setW(getW()+ 2);
         
         if (i == 2)
            setX(getX()-20);
            
         super.drawPetal(g2d);
      }
   }
   
   public void drawPetalsOutline(Graphics2D g2d)
   {
      setX(xxx);
      setY(yyy);
      setL(lll);
      setW(www);
      setC(roseC);
      
      for (int i = 1; i <= 2; i++)
      {
         setX(getX()+40);
         setY(getY()+30);
         setL(getL()-2);
         setW(getW()-2);
         
         if (i == 2)
            setX(getX()-20);
            
         super.drawPetalOutline(g2d);
      }
      
      setX(getX()+20);
      
      for (int i = 1; i <= 2; i++)
      {
         setX(getX()-40);
         setY(getY()+30);
         setL(getL()+ 2);
         setW(getW()+ 2);
         
         if (i == 2)
            setX(getX()+20);
            
         super.drawPetalOutline(g2d);
      }
      
      setX(getX()-20);
      
      for (int i = 1; i <= 2; i++)
      {
         setX(getX()-40);
         setY(getY()-30);
         setL(getL()- 2);
         setW(getW()- 2);
         
         if (i == 2)
            setX(getX()+20);
            
         super.drawPetalOutline(g2d);
      }
      
      setX(getX()-20);
      
      for (int i = 1; i <= 2; i++)
      {
         setX(getX()+40);
         setY(getY()-30);
         setL(getL()+ 2);
         setW(getW()+ 2);
         
         if (i == 2)
            setX(getX()-20);
            
         super.drawPetalOutline(g2d);
      }
   }
   
}
  