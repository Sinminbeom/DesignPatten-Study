package com.study.DesignPatten.factorymethod.after;

import com.study.DesignPatten.factorymethod.after.Ship;
import com.study.DesignPatten.factorymethod.after.ShipFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "WhiteShip", "alsqja17@naver.com");
        client.print(new BlackShipFactory(), "BlackShip", "alsqja17@naver.com");

//        Ship whiteship = new WhiteShipFactory().orderShip("WhiteShip","alsqja17@naver.com");
//        System.out.println(whiteship);
//        Ship blackship = new BlackShipFactory().orderShip("BlackShip","alsqja17@naver.com");
//        System.out.println(blackship);
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
