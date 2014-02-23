/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package si;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

/**
 *
 * @author David
 */
public class GameObjectClass extends JPanel implements ActionListener {
    boolean gameStart;
    public GameObjectClass(){
        gameStart=gameStart;
    }
    public void actionPerformed(ActionEvent e) {

    }

    public GameObjectClass(boolean gameStart) {
        this.gameStart = gameStart;
    }
    public boolean getGameStart(){
        return gameStart;
    }
     

    }

