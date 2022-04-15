package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        ComputationalGeometryApplication cga = new ComputationalGeometryApplication();
        cga.printAxis();



        GraphicalApplicationUI gAppUI = new GraphicalApplicationUI();
        gAppUI.PrintRect();

        //First Application


        //Second Application
        Modem modem = new Modem("2106469281");
        modem.dial();
        modem.Hangup();



    }
}
