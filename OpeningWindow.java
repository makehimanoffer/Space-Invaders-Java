/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

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
public class OpeningWindow extends GameObjectClass implements ActionListener {
    OpeningWindowListener op;

    int healthBuildUp;
    Board b;



    Timer time;




    Image img;




    boolean gameStart;



        public OpeningWindow(){
            gameStart=false;
            img=new ImageIcon("images/SpaceInvaderMenu.png").getImage();

            op=new OpeningWindowListener(false);
            
                b=new Board();
           





            addKeyListener(new AL());
            time = new Timer(5,this);
		time.start();


		setFocusable(true);

    }

    @Override
                public void actionPerformed(ActionEvent e) {
                   if(op.startGame==true){
                       b.actionPerformed(e);
                       b.s.move();b.enemyManager.move(b.s);
                       

                   }
                    





                    repaint();

	}

    @Override
                public void paint(Graphics g){
                    super.paint(g);
                    Graphics2D g2d = (Graphics2D) g;
                    setBackground(Color.BLACK);




                    //enemyManager.draw(g);


                    if(op.startGame==false){
                        g2d.drawImage(img,0,0,null);
                    }else{
                        b.paint(g);
                    }

                    

    }
    @Override
    public boolean getGameStart(){
        return op.startGame;
    }



            private class AL extends KeyAdapter {

        @Override
		public void keyReleased(KeyEvent keyEv) {
			op.keyReleased(keyEv);
                        b.s.keyReleased(keyEv);
                       
                        if(keyEv.getKeyCode()==KeyEvent.VK_SPACE){
                          //System.exit(0);
                            op.startGame=true;
                            

                        }

                        if(keyEv.getKeyCode()==KeyEvent.VK_N){
                            //gameIsOver=false;
                            System.exit(0);
                        }
                        if(keyEv.getKeyCode()==KeyEvent.VK_ENTER){
                           b.s.a= new Bullet(0,.27,b.s.getX()+20,b.s.getY()-5);
                          b.s.bullets.add(b.s.a);
                          
                          
                          if(b.s.bullets.size()>b.bulletAmount){
                              b.s.bullets.remove(b.s.a);
                          }

                        }
                        if(keyEv.getKeyCode()==KeyEvent.VK_Y){
                            b.gameIsOver=false;
                            b.restart();
                        }
                        if(keyEv.getKeyCode()==KeyEvent.VK_N){
                            //gameIsOver=false;
                            System.exit(0);
                        }

		}

        @Override
		public void keyPressed(KeyEvent e) {
			op.keyPressed(e);
                        b.s.keyPressed(e);
                       


		}
    }
        



















   }

