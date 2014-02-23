/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author David
 */
public class AnimateMyTake {
    long startTime=System.currentTimeMillis();
    Image [] still=new Image [3];
    Image [] Level= new Image [6];
    Image [] toughEnemy=new Image [3];
    
    
    int runTime=0;
    int teRunTime=0;
    int indexLength=0;
    ImageIcon i=new ImageIcon("images/CreeperInvader.png");
    ImageIcon j= new ImageIcon("images/CreeperInvaderAnimate.png");
    ImageIcon l=new ImageIcon("images/CreeperInvaderAlt2.png");
    ImageIcon k=new ImageIcon("C:/ship.png");
    public AnimateMyTake(){
        still [indexLength]= i.getImage();
        still [indexLength+1]=j.getImage();
        //still[2]=k.getImage();
        still[2]=l.getImage();
        Level [0]=new ImageIcon("images/Level1.png").getImage();
        Level [1]=new ImageIcon("images/Level2.png").getImage();
        Level [2]=new ImageIcon("images/Level3.png").getImage();
        Level [3]=new ImageIcon("images/Level4.png").getImage();
        Level [4]=new ImageIcon("images/Level5.png").getImage();
        Level [5]=new ImageIcon("images/Level6.png").getImage();
        toughEnemy[0]=new ImageIcon("images/ChargedCreeperInvaderProto.png").getImage();
        toughEnemy[1]=new ImageIcon("images/CCPA.png").getImage();
        toughEnemy[2]=new ImageIcon("image/CCPAHit.png").getImage();
       

    }
    
    public void draw(Graphics g,Enemy e){
       Random r= new Random();
       runTime++;
        if(runTime<400&&e.bool==false){
           g.drawImage(still[0], (int) e.getX(),e.getY(),null);
        }
        if(runTime>=400&&runTime<=800&&e.bool==false) {
            g.drawImage(still[1], (int) e.getX(), e.getY(), null);
            
        }
       
       if(runTime>800){
           runTime=0;
       }
       if(e.bool==true&&runTime<=800){
           g.drawImage(still[2], (int)e.getX(), e.getY(), null);
           if(runTime<4000){
              e.collCounter+=1;
              e.hitCounter+=1;
              runTime=0;
               
           }
       }
    }
       public void drawLevel(Graphics g,Ship s){
           if(s.level==1){
               g.drawImage(Level[0], 40, 0, null);
           }
           if(s.level==2){
               g.drawImage(Level[1], 40, 0, null);
           }
           if(s.level==3){
               g.drawImage(Level[2], 40, 0, null);
           }
           if(s.level==4){
               g.drawImage(Level[3], 40, 0, null);
           }
           if(s.level==5){
               g.drawImage(Level[4], 40, 0, null);
           }
           if(s.level==6){
               g.drawImage(Level[5], 40, 0, null);
           }


       }
       public void drawToughEnemy(Graphics g,ToughEnemy e){

      
        if(e.shooting==false&&e.health>0){
           g.drawImage(toughEnemy[0], (int) e.getX(),(int)e.getY(),null);
        }
        if(e.shooting==true&&e.health>0) {
            g.drawImage(toughEnemy[1], (int) e.getX(), (int)e.getY(), null);

        }
       
       

      
       
    }

        
       
    }
    




