package com.agalesanu;

public class ExampleWithClassesMain {

    public static void main(String[] args){

        Rocket blueRocket = new Rocket( 100,  50,  "BLUE");

        Rocket pinkRocket = new Rocket(  50,  100,  ":PINK");

        pinkRocket.sumWidthAndHeight();

        pinkRocket.toString();
    }
}
