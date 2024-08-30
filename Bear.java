// Bear.java
// This is for Project20bstv100.java
// Janee Yeak
// This class draws a bear holding a heart

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Bear
{
   private int x, y, headS;                                  // passed parameters  # 1
   private Color lightBrown, darkBrown, vLbrown;             // Some colours       # 2
   private int rEarX, rEarY, lEarX, lEarY, earS;             // ear measurements   # 3
   private int bodyWid, bodyLen, bodyX, bodyY;               // body measurements  # 4 
   private int noseX, noseY, noseL, noseW;                   // nose measurements  # 5
   private int snoutX, snoutY, snoutS;                       // snout measurements # 6
   private int lineX, lineY, lineXX, lineYY;                 // line coordinates   # 7
   private int lEyeX, lEyeY, rEyeX, rEyeY, eyeS;             // eye coordinates    # 8
   private int lfootX, lfootY, rfootX, rfootY, footW, footL; // foot coordinates   # 9 
   private int lsoleX, lsoleY, rsoleX, rsoleY, soleW, soleL; // sole coordinates   # 10 
   private int larmX, larmY, rarmX, rarmY, armW, armL;       // arm measurements   # 11
   private int lhandX, lhandY, rhandX, rhandY, handW, handL; // hand lengths       # 12
   
   public Bear(int xX, int yY, int headSize) 
   {
      x = xX;
      y = yY;
      headS = headSize;
      
      lightBrown = new Color(152, 123, 102);
      darkBrown = new Color(64, 39, 2);
      vLbrown = new Color(207, 175, 153);
      
      earS = headSize / 2; 
      lEarX = xX - earS + (headS/10*3);
      lEarY = yY - earS + (headS/10*3)+2; 
      rEarX = xX + earS + (headS / 5);
      rEarY = yY - earS + (headS/10*3)+2;
      
      bodyWid = earS + headS - (headS/10);
      bodyLen = headS + (headS/5*2);
      bodyY = yY + headS - (headS/5);
      bodyX = xX - (headS/5);
      
      noseW = headSize * 3 / 4 - (headS/10);
      noseL = headSize * 3 / 4;
      noseX = x + headSize - ((headSize - noseL) / 2) - noseL;
      noseY = y + headSize - noseW + 3; 
      
      snoutS = earS / 2 + (headS/10);
      snoutY = yY + noseW + noseW - snoutS - snoutS - (headS/10);
      snoutX = xX + noseL - snoutS - (headS/25);
      
      lineX = snoutX + (snoutS / 2);
      lineY = snoutY + snoutS;
      lineXX = lineX; 
      lineYY = lineY + (noseW - snoutS) / 2 - (headS/50*3);
      
      eyeS = snoutS / 2 - 2;
      lEyeX = snoutX - (headS/10);
      lEyeY = snoutY - eyeS - (headS/50*7);
      rEyeX = snoutX + snoutS - (headS/50*3);
      rEyeY = snoutY - eyeS - (headS/50*7);
      
      footL = headS - (headS/5);
      footW = headS / 2 + (headS/10);
      lfootX = bodyX - (footW/2) + (headS/5);
      lfootY = bodyY + bodyLen - (headS/5*3);
      rfootX = bodyX + bodyWid - (footW/2) - (headS/5);
      rfootY = bodyY + bodyLen - (headS/5*3);
      
      soleL = footL - 12;
      soleW = footW - 12;
      lsoleX = lfootX + 6;
      lsoleY = lfootY + 6;
      rsoleX = rfootX + 6;
      rsoleY = rfootY + 6;
      
      armW = headS / 2;
      armL = headS / 2 + (headS/35);
      larmX = x - (armW/2);
      larmY = y + headS;
      rarmX = x + headS - (armW/2);
      rarmY = y + headS;
      
      handW = armL;
      handL = headS/3*2;
      lhandX = larmX+armW-(headS/35);
      lhandY = larmY+armW/2;
      rhandX = rarmX-armW+(headS/35);
      rhandY = larmY+armW/2;
   }
  
   public void drawBear(Graphics2D g2d)
   {   
      drawBody(g2d);
      drawArms(g2d);      
      drawLegs(g2d);
      drawHead(g2d);
   }
   
   private void drawBody(Graphics2D g2d)
   {
      g2d.setColor(lightBrown);
      g2d.fillOval(bodyX, bodyY, bodyLen, bodyWid); // body

      g2d.setColor(darkBrown);
      g2d.drawOval(bodyX, bodyY, bodyLen, bodyWid); // body OUTLINE
   }
   
   private void drawArms(Graphics2D g2d)
   {
      int b = armW/2;
      
 ////////////////////////////////////////////////// DRAWING THE HEART //////////////////////////////////////////////////
      
      g2d.setColor(new Color (209, 9, 92)); // Royal Red

      g2d.fillOval(larmX+b, larmY+(armW/2), armW, armW);          // left half curve for the heart
      g2d.fillOval(larmX+b+armW, larmY+(armW/2), armW, armW);     // right half curve for the heart
              
      Polygon triangle = new Polygon();
      triangle.addPoint(larmX+b+5, lhandY+armW-5);               // top left point
      triangle.addPoint(larmX+b+armW, lhandY+b-5);               // middle point
      triangle.addPoint(larmX+armW+b+armW-5, rhandY+armW-5);     // top right point
      triangle.addPoint(larmX+b+armW, larmY+armW+armW+(armW/4)); // point at the bottom
      g2d.fillPolygon(triangle);
        
      g2d.setColor(Color.pink);
        
      g2d.drawArc(larmX+b, larmY+(armW/2), armW, armW, 20, 220);       // outlining the left half of the circle
      g2d.drawArc(larmX+b+armW, larmY+(armW/2), armW, armW, 305, 220); // outlining the right half of the circle
        
      g2d.drawLine(larmX+b+5, lhandY+armW-5,larmX+b+armW, larmY+armW+armW+(armW/4));            // outline heart, left?
      g2d.drawLine(larmX+armW+b+armW-5, rhandY+armW-5, larmX+b+armW, larmY+armW+armW+(armW/4)); // outline heart, right? 
      
////////////////////////////////////////////////// HERE'S FOR THE TEDDY BEAR'S ARMS //////////////////////////////////////////////////  
  
      g2d.setColor(lightBrown);
      
      g2d.fillOval(larmX, larmY, armW, armL);  // left arm
      g2d.fillOval(rarmX, rarmY, armW, armL);  // right arm
      
      g2d.setColor(darkBrown);
      g2d.drawOval(larmX, larmY, armW, armL); // outlining the left arm
      g2d.drawOval(rarmX, rarmY, armW, armL); // outlining the right arm.
   }
   
    
   private void drawLegs(Graphics2D g2d)
   {
      
      g2d.setColor(lightBrown);
       
      g2d.fillOval(lfootX, lfootY, footW, footL);  // left foot
      g2d.fillOval(rfootX, rfootY, footW, footL);  // right foot
      
      g2d.setColor(vLbrown); // very light brown
      g2d.fillOval(lsoleX, lsoleY, soleW, soleL); // left sole (sole of foot)
      g2d.fillOval(rsoleX, rsoleY, soleW, soleL); // right sole (sole of foot)
      
      g2d.setColor(darkBrown);
       
      g2d.drawOval(lfootX, lfootY, footW, footL);  // left foot
      g2d.drawOval(rfootX, rfootY, footW, footL);  // right foot   

      g2d.drawOval(lsoleX, lsoleY, soleW, soleL); // left sole (sole of foot)
      g2d.drawOval(rsoleX, rsoleY, soleW, soleL); // right sole (sole of foot)  
      
   }
   
   private void drawHead(Graphics2D g2d)
   {            
      g2d.setColor(lightBrown);
      
      g2d.fillOval(lEarX, lEarY, earS, earS);  // Left ear
      g2d.fillOval(rEarX, rEarY, earS, earS);  // Right ear
      
      g2d.setColor(new Color(233, 196, 188)); // pink brown 
      g2d.fillOval(lEarX+5, lEarY+5, earS-5, earS-5);   // ear tan
      g2d.fillOval(rEarX, rEarY+5, earS-5, earS-5);     // more ear tan
      
      g2d.setColor(darkBrown);
      
      g2d.drawOval(lEarX, lEarY, earS, earS);  // Left ear  OUTLINE
      g2d.drawOval(rEarX, rEarY, earS, earS);  // Right ear OUTLINE
      
      g2d.drawOval(lEarX+5, lEarY+5, earS-5, earS-5);   // ear tan OUTLINE
      g2d.drawOval(rEarX, rEarY+5, earS-5, earS-5);     // more ear tan OUTLINE
      
      g2d.setColor(lightBrown);
      
      g2d.fillOval(x, y, headS, headS); // head
      
      g2d.setColor(darkBrown);
      
      g2d.drawOval(x, y, headS, headS); // head OUTLINE
      
      g2d.setColor(vLbrown); // lighter brown.
      
      g2d.fillOval(noseX, noseY, noseL, noseW); // Nose.
      
      g2d.setColor(darkBrown);
           
      g2d.drawOval(noseX, noseY, noseL, noseW); // Nose OUTLINE
      
      g2d.fillOval(snoutX, snoutY, snoutS, snoutS); // snout
      
      g2d.drawLine(lineX, lineY, lineXX, lineYY);       // Mouth? thingy
      
      g2d.drawLine(lineXX-5, lineYY-3, lineXX, lineYY); // mouth smile. left side
      g2d.drawLine(lineXX+5, lineYY-3, lineXX, lineYY); // right side of the mouth 
      
      g2d.setColor(Color.black);
      
      g2d.fillOval(lEyeX, lEyeY, eyeS, eyeS); // left eye
      g2d.fillOval(rEyeX, rEyeY, eyeS, eyeS); // right eye 
   }
   

}
