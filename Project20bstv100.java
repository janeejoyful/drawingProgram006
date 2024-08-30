// Project20bstv100.java
// Janee Yeak
// 27 May 2021

package Project20bstv100;

import java.awt.*;
import javax.swing.*;

public class Project20bstv100
{  
     public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new Project20bstv100();
         }
      });
   }
   
   
   Project20bstv100() // Constructor.
   {
      JFrame frame = new JFrame("Bible Verse");
      
      frame.setSize(1024, 768);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Display d = new Display();
      frame.add(d);
      
      frame.setVisible(true);
   }
}
 