package com.company;

import javax.swing.*;

public class GraphicalApplicationUI {


    Shape shape;
    GraphicalApplicationUI ()
    {
        this.shape = new Shape();
    }


    public void PrintRect ()
    {
        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setContentPane(shape);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shape.draw();
        f.setVisible(true);
    }


    //LCOM --> 1-  ( 2 / 2 *1) = 1 - 1 = 0
}
