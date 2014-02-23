/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author David
 */
public class Bullet {
    double x;double y;int length,width;double dx;double dy;
    int hitCounter=0;

    Rectangle bulletRect= new Rectangle( (int) x, (int) y,length,width);
    Rectangle enemyRect;

    ImageIcon i= new ImageIcon("images/bullet2.png");
    Image still;
    Boolean hitTheWall=false;

    public Bullet(int dx,double dy,int x,int y){
        this.bulletRect=bulletRect;
        this.x=x;
        this.y=y;
        this.dx=dx;
        still=i.getImage();
        this.dy=dy;

    }

    public Rectangle getBulletRect() {
        return bulletRect;
    }
    public void move(Enemy e,Ship s){
        x=x+dx;
        y=y-dy;
        collisionCheck(e,s);
        //shipBulletCollision(s);
        if(getY()<0){
            dy=-dy;dx=.333;
            s.bullets.remove(this);
            hitTheWall=true;
        }
        if(getX()>=540){
            dx=-dx;hitTheWall=true;
             s.bullets.remove(this);
        }if(getX()<=0){
            dy=-dy;hitTheWall=true; s.bullets.remove(this);
        }
        if(getY()>=353){
            dy=-dy;hitTheWall=true; s.bullets.remove(this);
        }


    }
    public void draw(Graphics g,Ship s){

        g.drawImage(i.getImage(), (int) getX(), (int) getY(),null);
        

    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public void setY(int y) {
        this.y = y;
    }
    

    public void setX(int x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
    public boolean collisionCheck(Enemy e,Ship s){
        enemyRect= new Rectangle((int) e.getX(),e.getY(),20,20);

        EnemyManager enemyManager= new EnemyManager();/*enemyManager.a=e;enemyManager.b=e;enemyManager.c=e;
        enemyManager.d=e;enemyManager.e=e;enemyManager.f=e;enemyManager.g=e;enemyManager.h=e;enemyManager.i=e;
        enemyManager.j=e;enemyManager.k=e;enemyManager.l=e;enemyManager.m=e;enemyManager.o=e;enemyManager.p=e;
        enemyManager.q=e;enemyManager.r=e;enemyManager.ss=e;enemyManager.t=e;enemyManager.u=e;enemyManager.v=e;
        enemyManager.w=e;enemyManager.xx=e;enemyManager.yy=e;enemyManager.z=e;enemyManager.ba=e;enemyManager.bb=e;enemyManager.bc=e;
         *
         */
        
        bulletRect= new Rectangle( (int) x, (int) y,10,10);
        if(bulletRect.intersects(enemyRect.getBounds())&&e.hitCounter<=1){
            
            
            
            s.score+=1;
           // e.collCounter+=1;
            //e.hitCounter+=1;
            s.bullets.remove(this);
            bulletRect=null;
            enemyRect=null;
            enemyManager.eee.remove(e);
            //hitCounter=1;
            e.bool=true;
            
            
            
            
            return true;

        }
       
        return false;
    }
    /*
    public boolean shipBulletCollision(Ship s){
        Rectangle bulletRect= new Rectangle( (int) x, (int) y,10,10);
        Rectangle shipRect= new Rectangle(s.getX(),s.getY(),50,50);
        if(bulletRect.getBounds().intersects(shipRect.getBounds())&&hitWall()==true){
            
            s.health-=1;
            s.bullets.remove(this);
            return s.shipColl=true;
        }
        return s.shipColl=false;
    }

    public boolean  hitWall(){
        return hitTheWall;
    }
     *
     */

}
