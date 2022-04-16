package day47_encapsulation;

import day43_custom_classes2.TrafficLight;

public class TrafficLights {

    String color;

    public TrafficLights(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color){
            case "red":
            case "yellow":
            case "green":
                this.color = color;
        }
    }
}
