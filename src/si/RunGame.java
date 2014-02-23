/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class RunGame {
    public final int leng= 600;
    public final int wid= 400;
    GameObjectClass a;
    boolean gameStart;



	public RunGame(){
		JFrame frame = new JFrame();
                a=new OpeningWindow ();
                gameStart=a.getGameStart();

                frame.add(a);





		frame.setTitle("2-D Test Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(leng,wid);
                frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
        public static void main(String [] args){
            new RunGame();
        }







}
