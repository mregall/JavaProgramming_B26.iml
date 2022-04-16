package day47_encapsulation;

import day43_custom_classes2.TrafficLight;

public class Road {
    public static void main(String[] args) {

        //the logic in the switch case only allows the correct values
        TrafficLights intersection = new TrafficLights("green");
        System.out.println(intersection.color);

        //this line of code does nothing because it's incorrect color
        intersection.color = "black";

        TrafficLights corner = new TrafficLights("red");
        System.out.println(corner.getColor());

        corner.setColor("grey");
        System.out.println(corner.getColor());


    }
}
