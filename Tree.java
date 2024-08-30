// Tree.java
// This is for Project20bstv100.java
// Janee Yeak
// This class exercises composition  with the Trunk and Leaves class.

package Project20bstv100;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Tree
{
   private Trunk treeTrunk;
   private Leaves treeLeaves;
   
   public Tree(int xX, int yY, int length123, int rad) 
   {
      treeTrunk = new Trunk(xX, yY, length123);
      treeLeaves= new Leaves(xX, yY, length123, rad);
   }
  
   public void drawTree(Graphics2D g2d)
   { 
      treeTrunk.drawTrunk(g2d);  
      treeLeaves.drawLeaves(g2d);
   } 
}
