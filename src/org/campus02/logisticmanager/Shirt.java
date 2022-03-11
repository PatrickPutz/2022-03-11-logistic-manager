package org.campus02.logisticmanager;

public class Shirt implements Moveable{

    private String brand;
    private String size;
    private String color;

    public Shirt(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public void move(String destination) {
        System.out.println(this.color + " " + this.brand + " shirt, size " + this.size + ", will be moved to " + destination);
    }

    @Override
    public String toString() {
        return "org.campus02.logisticmanager.Shirt{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
