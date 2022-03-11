package org.campus02.logisticmanager;

public class Car implements Moveable{

    private String type;
    private String color;
    private double weight;

    public Car(String type, String color, double weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println(this.color + " " + this.type + " will be moved to " + destination);
    }

    @Override
    public String toString() {
        return "org.campus02.logisticmanager.Car{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
