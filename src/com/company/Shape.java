package com.company;

import javax.swing.*;
import java.awt.*;

public class Shape extends JComponent {

    public void draw()
    {
        rect = new Rectangle(xUpperLeftCorner, yUpperLeftCorner, width, height);
        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.draw(rect);
    }



    private int xUpperLeftCorner = 0;
    private int yUpperLeftCorner = 0;
    private int width = 200;
    private int height = 200;
    private Rectangle rect;

	/*
	LCM --> 1- (Sum(1 + 1 +2 +2 +1)/ 4 * 5 ) = 1 - 13/20 = 0.35
	 */


    //Deutero ypoerotima

}


