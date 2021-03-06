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
	LC0M --> 1- (Sum(2  + 1 + 1 + 1 + 1 )/ 3 * 5 ) = 1 - 6/15 = 9/15 = 0.6
	 */


// Initial Class Shape LCOM   = 1 - (Sum (1 +1 + 2 + 2 + 2 ) / 5 *5 ) = 1 - 8/25 = 17/25 = 0.68

}


