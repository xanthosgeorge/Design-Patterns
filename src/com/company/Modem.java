package com.company;

public class Modem {
    DataChannel dc ;
    Connection con;

    Modem (DataChannel dc , Connection con)
    {
        this.dc = dc;
        this.con = con;
    }
}
