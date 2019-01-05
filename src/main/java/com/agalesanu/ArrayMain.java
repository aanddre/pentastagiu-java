package com.agalesanu;

public class ArrayMain {

    public static void main(String[] args) {

        Rocket [] myRocketArray = new Rocket[5];

        myRocketArray[0] = new Rocket(100, 100, "RED");
        myRocketArray[0] = new Rocket(100, 100, "BLUE");

        myRocketArray[1] = myRocketArray[0];

        System.out.print("aa");
    }
}
