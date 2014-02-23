/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author David
 */
public class Board extends GameObjectClass implements ActionListener {
     int i=1;int ii=10;int j=0;int x=0;int y=1;int FrameLength=540;
    public Ship s;
    EnemyManager enemyManager;
    AnimateMyTake anime;
    int healthBuildUp;
    boolean gameStart;
    int bulletAmount;
    double waitTime=0;
    
   
   
   
    
    Timer time;
    public CopyOnWriteArrayList<Bullet> bullets;
    public CopyOnWriteArrayList<Enemy> e;
   
   
   
    Image img;

    public CopyOnWriteArrayList<Enemy> eee= new CopyOnWriteArrayList<Enemy>();
    public Enemy c;
    public Enemy b;public Enemy d; //public Enemy ee;public Enemy f;
   // public Enemy g;public Enemy h;public Enemy ij;public Enemy ji;public Enemy k;public Enemy l;
   // public Enemy m;public Enemy n;public Enemy o;public Enemy p;public Enemy q;public Enemy r;
    //public Enemy ss;public Enemy t;public Enemy u;public Enemy v;public Enemy w;public Enemy xx;
    //public Enemy yy;public Enemy z;public Enemy ba;public Enemy bb;public Enemy bc;public Enemy bd;
    //public Enemy be;
     
    public Enemy a;
    Bullet bullet;
    boolean gameIsOver;
    boolean gameIsWon;
    ToughEnemy te;
    



        public Board(){
            bullets= new CopyOnWriteArrayList<Bullet>();
            anime=new AnimateMyTake();
            gameIsOver=false;
            healthBuildUp=5;
            gameStart=true;
            gameIsWon=false;
            te=new ToughEnemy(1,0,0,3);
            
            
            img=new ImageIcon("images/Background Screen.png").getImage();
            bulletAmount=7;
            
           
            
            
            
            enemyManager=new EnemyManager();
            s=new Ship(200,318,10);
            
            
            addKeyListener(new AL());
            time = new Timer(5,this);
		time.start();

            
		setFocusable(true);
		
    }

                public void actionPerformed(ActionEvent e) {
                   // a.move();
                    s.move();
                   // c.move();
                    enemyManager.move(s);
                    te.move();
                    
                   
                    
                    
                    repaint();
                
	}

    @Override
                public void paint(Graphics g){
                    super.paint(g);
                    Graphics2D g2d = (Graphics2D) g;
                    //g.drawImage(img,0,0,null);
                    setBackground(Color.BLACK);
                    shipStatus(g);

                    //System.out.println("Y=" + s.getY());

                    if(gameIsWon==true){
                        gameOverWin(g);
                    }
                    //enemyManager.draw(g);


                    if(gameIsOver==false){

                    g2d.drawImage(s.getImage(),s.getX(),s.getY(),null);
                    te.paint(g,s);
                    g2d.setColor(Color.WHITE);
                    anime.drawLevel(g,s);
                    g2d.drawString("Score: "+ s.score,40, 100);
                   
                    drawLoadsOfStuff(g);
                    for(Bullet bulletBill : s.bullets){
                    bullet=bulletBill;
                    te.a.shipBulletCollision(te, s);
                    move();
                    bulletBill.draw(g,s);
                    
                    


                    repaint();
                }
                    toDrawOrNotToDraw(g);
                    //animate(g);
                    

                    repaint();
                    
                    
                    }




                    

                }



            public class AL extends KeyAdapter {

        @Override
		public void keyReleased(KeyEvent keyEv) {
			s.keyReleased(keyEv);
                        

		}

        @Override
		public void keyPressed(KeyEvent e) {
			s.keyPressed(e);
                        

		}
	}

       

        public void toDrawOrNotToDraw(Graphics g){

            if( enemyManager.a.collCounter<1){
                        
                        anime.draw(g,enemyManager.a);
                         }
            if(enemyManager.b.collCounter<1){
                    
                    anime.draw(g,enemyManager.b);

            }
            if(enemyManager.c.collCounter<1){
                
                anime.draw(g,enemyManager.c);
            }
            if(enemyManager.d.collCounter<1){
                
                anime.draw(g,enemyManager.d);
            }
            if(enemyManager.e.collCounter<1){
                
                anime.draw(g,enemyManager.e);
            }
            if(enemyManager.f.collCounter<1){
                
                anime.draw(g,enemyManager.f);
            }
            if(enemyManager.g.collCounter<1){
                
                anime.draw(g,enemyManager.g);
            }if(enemyManager.h.collCounter<1){
               
                anime.draw(g,enemyManager.h);
            }if(enemyManager.i.collCounter<1){
                
                anime.draw(g,enemyManager.i);
            }if(enemyManager.j.collCounter<1){
                
                anime.draw(g,enemyManager.j);
            }if(enemyManager.k.collCounter<1){
                
                anime.draw(g,enemyManager.k);
            }
            if( enemyManager.l.collCounter<1){
                        
                        anime.draw(g,enemyManager.l);
                         }
            if(enemyManager.m.collCounter<1){
                    
                    anime.draw(g,enemyManager.m);

            }
            if(enemyManager.n.collCounter<1){
                
                anime.draw(g,enemyManager.n);
            }
            if(enemyManager.o.collCounter<1){
                
                anime.draw(g,enemyManager.o);
            }
            if(enemyManager.p.collCounter<1){
                
                anime.draw(g,enemyManager.p);
            }
            if(enemyManager.q.collCounter<1){
                
                anime.draw(g,enemyManager.q);
            }
            if(enemyManager.r.collCounter<1){
                
                anime.draw(g,enemyManager.r);
            }if(enemyManager.ss.collCounter<1){
                
                anime.draw(g,enemyManager.ss);
            }if(enemyManager.t.collCounter<1){
                
                anime.draw(g,enemyManager.t);
            }if(enemyManager.u.collCounter<1){
                
                anime.draw(g,enemyManager.u);
            }if(enemyManager.v.collCounter<1){
                
                anime.draw(g,enemyManager.v);
            }if(enemyManager.w.collCounter<1){
               
                anime.draw(g,enemyManager.w);
            }
            if(enemyManager.xx.collCounter<1){
                
                anime.draw(g,enemyManager.xx);
            }
            if(enemyManager.yy.collCounter<1){
                
                anime.draw(g,enemyManager.yy);
            }
            if(enemyManager.z.collCounter<1){
                
                anime.draw(g,enemyManager.z);
            }
            if(enemyManager.ba.collCounter<1){
                
                anime.draw(g,enemyManager.ba);
            }
            if(enemyManager.bb.collCounter<1){
               
                anime.draw(g,enemyManager.bb);
            }
            if(enemyManager.bc.collCounter<1){
                
                anime.draw(g,enemyManager.bc);
            }

            redrawEverything();



        }
        public void drawLoadsOfStuff(Graphics g){
            Random r= new Random();
            
            g.setColor(Color.WHITE);
           g.drawLine(75,75,75,75);g.drawLine(150,75,150,75);g.drawLine(225,75,225,75);
           g.drawLine(350,75,350,75);g.drawLine(425,75,425,75);g.drawLine(505,75,505,75);
           g.drawLine(75,150,75,150);g.drawLine(150,150,150,150);g.drawLine(225,150,225,150);
           g.drawLine(350,150,350,150);g.drawLine(425,150,425,150);g.drawLine(505,150,505,150);
           g.drawLine(75,225,75,225);g.drawLine(150,225,150,225);g.drawLine(225,225,225,225);
           g.drawLine(350,225,350,225);g.drawLine(425,225,425,225);g.drawLine(505,225,505,225);
           g.drawLine(75,350,75,350);g.drawLine(150,350,150,350);g.drawLine(225,350,225,350);
           g.drawLine(350,350,350,350);g.drawLine(425,350,425,350);g.drawLine(505,350,505,350);
            



           
                
            }

        public void move(){
            bullet.move(enemyManager.a, s);bullet.move(enemyManager.b, s);bullet.move(enemyManager.c, s);
            bullet.move(enemyManager.d, s);bullet.move(enemyManager.e, s);bullet.move(enemyManager.f, s);
            bullet.move(enemyManager.g, s);bullet.move(enemyManager.h, s);bullet.move(enemyManager.i, s);
            bullet.move(enemyManager.j, s);bullet.move(enemyManager.k, s);bullet.move(enemyManager.l,s);
            bullet.move(enemyManager.m,s);bullet.move(enemyManager.o,s);bullet.move(enemyManager.p,s);
            bullet.move(enemyManager.q,s);bullet.move(enemyManager.r,s);bullet.move(enemyManager.ss,s);
            bullet.move(enemyManager.t,s);bullet.move(enemyManager.u,s);bullet.move(enemyManager.v,s);
            bullet.move(enemyManager.w,s);bullet.move(enemyManager.xx,s);bullet.move(enemyManager.yy,s);
            bullet.move(enemyManager.z,s);bullet.move(enemyManager.ba,s);bullet.move(enemyManager.bb,s);
            bullet.move(enemyManager.bc,s);bullet.move(enemyManager.n,s);

        }
        public void animate(Graphics g){
            anime.draw(g,enemyManager.a);anime.draw(g,enemyManager.b);anime.draw(g,enemyManager.c);anime.draw(g,enemyManager.d);
            anime.draw(g,enemyManager.e);anime.draw(g,enemyManager.f);anime.draw(g,enemyManager.g);
            anime.draw(g,enemyManager.h);anime.draw(g,enemyManager.i);anime.draw(g,enemyManager.j);
            anime.draw(g,enemyManager.k);



        }
        public boolean shipStatus(Graphics g){
            Image gameOver;
            ImageIcon i= new ImageIcon("images/gameover1.png");gameOver=i.getImage();
            if(s.health<=0){
                enemyManager.gameOver();
                
                
                
                g.drawImage(gameOver, 0, 0,null);
                return gameIsOver=true;
                
                
            }
            if(!(s.health<=0)){
                gameOver=null;
            }
            return gameIsOver=false;

        }
        public void restart(){
            healthBuildUp+=2;
            s=new Ship(200,318,healthBuildUp);
            enemyManager=new EnemyManager();
            te=new ToughEnemy(1,0,0,3);
        }
            
        public void redrawEverything(){
            if(enemyManager.a.collCounter>=1&&enemyManager.b.collCounter>=1&&enemyManager.c.collCounter>=1&&
                    enemyManager.d.collCounter>=1&&enemyManager.e.collCounter>=1&&enemyManager.f.collCounter>=1&&
                    enemyManager.g.collCounter>=1&&enemyManager.h.collCounter>=1&&enemyManager.i.collCounter>=1&&
                    enemyManager.j.collCounter>=1&&enemyManager.k.collCounter>=1&&enemyManager.l.collCounter>=1&&
                    enemyManager.m.collCounter>=1&&enemyManager.n.collCounter>=1&&enemyManager.o.collCounter>=1&&
                    enemyManager.p.collCounter>=1&&enemyManager.q.collCounter>=1&&enemyManager.r.collCounter>=1&&
                    enemyManager.ss.collCounter>=1&&enemyManager.t.collCounter>=1&&enemyManager.u.collCounter>=1&&
                    enemyManager.v.collCounter>=1&&enemyManager.w.collCounter>=1&&enemyManager.xx.collCounter>=1&&
                    enemyManager.yy.collCounter>=1&&enemyManager.z.collCounter>=1&&enemyManager.ba.collCounter>=1&&
                    enemyManager.bb.collCounter>=1&&enemyManager.bc.collCounter>=1){
                enemyManager=new EnemyManager();
                if(healthBuildUp>10){
                s.health=healthBuildUp-10;
                }
                if(bulletAmount>2){
                    bulletAmount-=1;
                }
                
                  s.level+=1;
                  if(s.level==7){
                      te=new ToughEnemy(1,0,0,11);
                      
                  }
                  if(s.level==8){

                    gameIsWon=true;

                }


                }
                
                
    }
            public void gameOverWin(Graphics g){
                
                gameIsOver=true;
                waitTime+=1;
                
                
                Image BiWinning=new ImageIcon("images/YouWinTheGame1.jpg").getImage();
                g.drawImage(BiWinning,0,0,null);
                if(waitTime>=500){
                    System.exit(0);
                }
                
               
                
            }
           

        }
            
            
            
    


        
 
  
