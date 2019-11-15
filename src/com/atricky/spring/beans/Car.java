package com.atricky.spring.beans;

public class Car {
    private String brand;
    private String corp;
    private int price;
    private int maxSpeed;
    public Car(String brand, String corp, int price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    @Override
    public String toString() {
        return "brand:" + this.brand + " & corp:" + this.corp + " & price:" + this.price + " & maxSpeed:" + this.maxSpeed;
    }
}
