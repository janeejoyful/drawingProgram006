// Message.java
// This is for Project20bstv100.java
// Janee Yeak

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class Message extends JLabel
{
   private String message1, font1;
   private int x, y, times, origY;
   private ArrayList<String> words;
   private String myString;
      
   public Message(int xX, int yY, String m) 
   {  
      message1 = m; // I wanted to customise my own font,
      x = xX;       // That is a project for the future me....
      y = yY;
      words = new ArrayList<String>();
      myString = "";
      times = 0;
      origY = yY;
   }
  
   public void printMessage(Graphics2D g2d)
   {
      g2d.setColor(Color.black);
      g2d.setFont(new Font("Apple Chancery", Font.PLAIN, 30));
      
      boolean found = false;
       
      g2d.setColor(Color.black);
      
      for(String w:message1.split("\\s")){  // The Split method sure is helpful! :)
         words.add(w);
      } 
      
      do {
        
        int length = words.size();
         
        if (length < 6) 
        {
            
            for (int the = 0; the < length; the++)
            { 
                  myString += words.get(the) + " ";
                  times += 3; // stop the loop.
            }
           
            g2d.drawString(myString, x, y);
        }

       else if (length >= 6)
       {
         myString = words.get(0)+" "+words.get(1)+" "+words.get(2)+" "+words.get(3)+" "+words.get(4)+" "+words.get(5); //for(abcd = 0; abcd < 6; abcd++);         
         g2d.drawString(myString, x, y);
         y+=50;
         myString = "";
         
         for (int gsd = 1; gsd <= 6; gsd++)
         {
            words.remove(0);
         }
       }
                         
       times++;
       
       }
       while (times < 3 && words != null); 
       
       y = origY;
   }
}
