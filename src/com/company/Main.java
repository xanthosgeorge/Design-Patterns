package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        Shape shape = new Shape();
       Geometricshape cga = new Geometricshape(shape);
        System.out.println("Lower Right Corner. X: " + cga.getXLowerRightCorner()
                + " Y: " + cga.getYLowerRightCorner());

        //First Application



        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setContentPane(shape);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shape.draw();
        f.setVisible(true);



        //Second Erwtima



    }
}
