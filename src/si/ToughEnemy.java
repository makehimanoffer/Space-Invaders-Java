/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author David
 */
public class ToughEnemy {
    double x,y,dx;int health;
    EnemyBullet a;
    Rectangle ToughEnemyRect;
    boolean hit;
    boolean shooting;
    CopyOnWriteArrayList<EnemyBullet> bullets;
    public ToughEnemy(double dx,double x,double y,int health){
        bullets=new CopyOnWriteArrayList<EnemyBullet>();
        this.x=x;
        this.y=y;
        this.dx=dx;
        this.health=health;
        hit=false;
        ToughEnemyRect=new Rectangle((int)x,(int)y,40,40);
        shooting=false;
    }
    public void move(){
        x=x+dx;
        if((x==90||x==270||x==450||x==540)&&health>0){
            a=new EnemyBullet(0,3,(int)x+20,(int)y+40);bullets.add(a);
            shooting=true;
            
        }
        if(x<=0){
            dx=-dx;shooting=false;
        }
        if(x>=570){
            dx=-dx;shooting=false;
        }
        if(health<=0){
            hit=true;
        }
        
       
    }
    public void paint(Graphics g,Ship s){
        AnimateMyTake anime= new AnimateMyTake();
        anime.drawToughEnemy(g,this);

        for(EnemyBullet bulletBill:bullets){
            bulletBill=a;
            bulletBill.draw(g);
            bulletBill.move(s,this);
            bulletBill.collisionCheck(this,s);
           
        }
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public Rectangle getToughEnemyRect() {
        return ToughEnemyRect;
    }

    public double getDx() {
        return dx;
    }
}
