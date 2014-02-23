/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

import java.awt.Graphics;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author David
 */
public class EnemyManager {
    Enemy a;public Enemy e;public Enemy f;public Enemy b;public Enemy c;public Enemy d;
    public Enemy g;public Enemy h;public Enemy i;public Enemy j;public Enemy k;public Enemy l;
    public Enemy m;public Enemy n;public Enemy o;public Enemy p;public Enemy q;public Enemy r;
   public Enemy ss;public Enemy t;public Enemy u;public Enemy v;public Enemy w;public Enemy xx;
    public Enemy yy;public Enemy z;public Enemy ba;public Enemy bb;public Enemy bc;public Enemy bd;
    public Enemy be;
    public CopyOnWriteArrayList<Enemy> eee= new CopyOnWriteArrayList<Enemy>();
    double dx=-1;int xPos;int yPos=40;
    int dy=0;int FrameLength=540;
    public EnemyManager(){
        eee= new CopyOnWriteArrayList<Enemy>();
        a=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        b=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        c=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        d=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        e=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos=5;

        yPos+=25;

        f=new Enemy(-dx,dy,xPos,yPos);
        g=new Enemy(-dx,dy,xPos+20,yPos);
        h=new Enemy(-dx,dy,xPos+40,yPos);
        i=new Enemy(-dx,dy,xPos+60,yPos);
        j=new Enemy(-dx,dy,xPos+80,yPos);
        k=new Enemy(-dx,dy,xPos+100,yPos);

        xPos=0;yPos+=25;


        l=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        m=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        n=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        o=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        p=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        q=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos=5;
        yPos+=25;

        r=new Enemy(-dx,dy,xPos,yPos);
        ss=new Enemy(-dx,dy,xPos+20,yPos);
        t=new Enemy(-dx,dy,xPos+40,yPos);
        u=new Enemy(-dx,dy,xPos+60,yPos);
        v=new Enemy(-dx,dy,xPos+80,yPos);
        w=new Enemy(-dx,dy,xPos+100,yPos);

        xPos=0;yPos+=25;
        xx=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        yy=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        z=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        ba=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        bb=new Enemy(dx,dy,FrameLength-xPos,yPos);xPos+=25;
        bc=new Enemy(dx,dy,FrameLength-xPos,yPos);
        addThemAll();

    }
    /*
    public void draw(Graphics g2d){
        g2d.drawImage(a.getImage(),a.getX(),a.getY(),null);
        g2d.drawImage(b.getImage(),b.getX(),b.getY(),null);
        g2d.drawImage(c.getImage(),c.getX(),c.getY(),null);
        g2d.drawImage(d.getImage(),d.getX(),d.getY(),null);
        g2d.drawImage(e.getImage(),e.getX(),e.getY(),null);
        g2d.drawImage(f.getImage(),f.getX(), f.getY(),null);
g2d.drawImage(g.getImage(),g.getX(), g.getY(),null);
g2d.drawImage(h.getImage(),h.getX(), h.getY(),null);
g2d.drawImage(i.getImage(),i.getX(), i.getY(),null);
g2d.drawImage(j.getImage(),j.getX(), j.getY(),null);
g2d.drawImage(k.getImage(),k.getX(), k.getY(),null);
g2d.drawImage(l.getImage(),l.getX(), l.getY(),null);
g2d.drawImage(m.getImage(),m.getX(), m.getY(),null);
g2d.drawImage(n.getImage(),n.getX(), n.getY(),null);
g2d.drawImage(o.getImage(),o.getX(), o.getY(),null);
g2d.drawImage(p.getImage(),p.getX(), p.getY(),null);
g2d.drawImage(q.getImage(),q.getX(), q.getY(),null);
g2d.drawImage(r.getImage(),r.getX(), r.getY(),null);
g2d.drawImage(ss.getImage(),ss.getX(), ss.getY(),null);
g2d.drawImage(t.getImage(),t.getX(), t.getY(),null);
g2d.drawImage(u.getImage(),u.getX(), u.getY(),null);
g2d.drawImage(v.getImage(),v.getX(), v.getY(),null);
g2d.drawImage(w.getImage(),w.getX(), w.getY(),null);
g2d.drawImage(xx.getImage(),xx.getX(), xx.getY(),null);
g2d.drawImage(yy.getImage(),yy.getX(), yy.getY(),null);
g2d.drawImage(z.getImage(),z.getX(), z.getY(),null);
g2d.drawImage(ba.getImage(),ba.getX(), ba.getY(),null);
g2d.drawImage(bb.getImage(),bb.getX(), bb.getY(),null);
g2d.drawImage(bc.getImage(),bc.getX(), bc.getY(),null);

    }
     * 
     */
    public void move(Ship s){
        a.move(s);b.move(s);c.move(s);d.move(s);e.move(s);f.move(s);g.move(s);h.move(s);i.move(s);j.move(s);k.move(s);
        l.move(s);m.move(s);n.move(s);o.move(s);p.move(s);q.move(s);r.move(s);ss.move(s);t.move(s);u.move(s);v.move(s);
        w.move(s);xx.move(s);yy.move(s);z.move(s);ba.move(s);bb.move(s);bc.move(s);
    }
    public void gameOver(){
        eee.removeAll(eee);
    }
    public void addThemAll(){
        eee.add(a);eee.add(b);eee.add(c);eee.add(d);eee.add(e);eee.add(f);eee.add(g);eee.add(h);eee.add(i);eee.add(j);eee.add(k);eee.add(l);eee.add(m);eee.add(n);eee.add(o);eee.add(p);eee.add(q);eee.add(e);eee.add(ss);eee.add(t);eee.add(u);eee.add(v);eee.add(w);eee.add(xx);eee.add(yy);eee.add(z);eee.add(ba);eee.add(bb);eee.add(bc);
    }





}
