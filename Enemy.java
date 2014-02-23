/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author David
 */
public class Enemy {
    int y,dy,length,width;double x;
    double dx;
    Image enemy;
    
    boolean bool=false;
    int hitCounter=1;
    int collCounter=0;





    public Enemy(double dx,int dy,double x,int y){
        ImageIcon i=new ImageIcon("images/CreeperInvader.png");
        enemy=i.getImage();
        this.x=x;
       this.y=y;
       this.dx=dx;
       this.dy=y;
       
       




    }
    public Enemy(){

    }
    public void move(Ship s) {
        x=x+dx;
        if(shipAndEnemyCollision(s)==true){
            s.health=s.health-1;
        }
        //y=y+dy;
        if(x<=0){
            
            //dy=2;
            
            dy=0;
            
            dx=-dx;
            moveDown();

        }
        if(x>=570){
            //dy=3;
            dy=0;
            dx=-dx;
            x=569;
            moveDown();
        }
        if(y>=365){
            s.health=0;
            
        }
        
        
    }
     public Image getImage() {
        return enemy;
    }

    public void setImage(Image enemy) {
        this.enemy = enemy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getDy() {
        return dy;
    }

    public double getDx() {
        return dx;
    }

    public int getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    public void moveDown(){
        y+=25;
        dx=dx*1.13;
    }
   
     public boolean shipAndEnemyCollision(Ship s){
       Rectangle enemyRect=new Rectangle((int) getX(),getY(),20,20);
       Rectangle shipRect= new Rectangle(s.getX(),s.getY(),50,50);
        if(enemyRect.getBounds().intersects(shipRect)&&collCounter<1){
            
            System.out.println("hit by enemy");
            return true;
        }
        return false;
    }
    


    
    
    
}

