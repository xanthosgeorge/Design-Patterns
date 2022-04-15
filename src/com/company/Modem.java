package com.company;

public class Modem  implements  DataChannel,Connection{

String tel;

Modem (String tel)
{
    this.tel = tel;
}

    @Override
    public void dial() {
        System.out.println("Calling ..." + tel);
    }

    @Override
    public void Hangup() {
        System.out.println("Hanging up ..." + tel);
    }

    @Override
    public void send() {

    }

    @Override
    public void recv() {

    }
}
