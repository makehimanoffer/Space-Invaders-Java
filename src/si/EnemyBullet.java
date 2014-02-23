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
public class EnemyBullet {
    double x;double y;int length,width;double dx;double dy;
    int hitCounter=0;

    Rectangle bulletRect= new Rectangle( (int) x, (int) y,length,width);
    Rectangle shipRect;

    ImageIcon i= new ImageIcon("images/bullet1.png");
    Image still;
    Boolean hitTheWall=false;

    public EnemyBullet(int dx,double dy,int x,int y){
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
    public void move(Ship s,ToughEnemy te){
        x=x+dx;
        y=y+dy;
        collisionCheck(te,s);
        //shipBulletCollision(s);
        if(getY()<0){
            
            te.bullets.remove(this);te.shooting=false;
            
        }
        if(getX()>=540){
            te.shooting=false;
             
        }if(getX()<=0){
             te.shooting=false;
        }
        if(getY()>=373){
             te.bullets.remove(this);te.shooting=false;
        }

        



    }
    public void draw(Graphics g){

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
    public boolean collisionCheck(ToughEnemy te,Ship s){
        

        bulletRect= new Rectangle( (int) x, (int) y,10,10);
        if(bulletRect.intersects(s.shipRect.getBounds())){


            
            //s.score+=1;
           s.health-=1;
            //e.hitCounter+=1;
            te.bullets.remove(this);
            te.shooting=false;
            bulletRect=null;
            shipRect=null;

            //hitCounter=1;
            //e.bool=true;




            return true;

        }

        return false;
    }

    public void shipBulletCollision(ToughEnemy te,Ship s){
        Rectangle bulletRect= new Rectangle((int)s.a.getX(),(int)s.a.getY(),10,10);
        Rectangle teRect= new Rectangle((int)x,(int)y,40,40);
        if(bulletRect.getBounds().intersects(teRect.getBounds())){
            s.score+=10;
            te.health-=1;

            
            
            
        
    }




}
}
