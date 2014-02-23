/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author David
 */
public class OpeningWindowListener  {
    boolean startGame=false;
    public OpeningWindowListener(boolean startGame){
        this.startGame=startGame;
    }
   
    public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT){
                   // System.exit(1);
        }



		if (key == KeyEvent.VK_RIGHT){
                  //  System.exit(1);
                    }




	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		
                if(key== KeyEvent.VK_SPACE){
                        startGame=true;
                        

                    }
    }
}

