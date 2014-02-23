/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author David
 */
public class Ship {
    int x,y,dx,dy;
    int FrameLength= 373;
    int FrameWidth=520;
    int score=0;
    int level=1;
    Image ship;
    public CopyOnWriteArrayList<Bullet> bullets= new CopyOnWriteArrayList<Bullet>();
    Rectangle bulletRect;
    Rectangle shipRect;
    Bullet a;
    Image still;
    int health;
    boolean shipColl=false;



    public Ship(int x,int y,int health){
       
       this.health=health;
       
       this.x=x;
       
       this.y=y;
       shipRect=new Rectangle(x,y,50,50);
       
       //dx=1;
       
       //dy=1;
       ImageIcon i= new ImageIcon("images/ship.png");
       still=i.getImage();

    }
    public int getX(){
        return x;
    }
    public void move() {
		x = x + dx;

                y=y+dy;
                if(y<=0){
                dy=-dy;
                //return dy;
            }
            if(y>=FrameLength){
                y=FrameLength-1;

                //return dy;
            }
            if(x<=0){
                x=1;
               // return dx;
            }
            if(x>=FrameWidth){
                x=FrameWidth-2;
               // return dx;
            }
	}

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return still;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }
    public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT){
			dx = -2;}



		if (key == KeyEvent.VK_RIGHT){
			dx = 2;}


               
                
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		if (key == KeyEvent.VK_LEFT){
			dx = 0;
                        dy=0;}

		if (key == KeyEvent.VK_RIGHT){
			dx = 0;
                        dy=0;}
                if(key== KeyEvent.VK_UP){
                        dy =0;dx=0;}
                if(key== KeyEvent.VK_DOWN){
                        dy=0;dx=0;}
	}
        public Rectangle getBulletRect(){
            return bulletRect;
        }
        public Bullet getBullet(){
            return a;
        }
        public Rectangle getShipRect(){
            return shipRect;
        }


}
