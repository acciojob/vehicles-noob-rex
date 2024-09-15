package com.driver;

public class Main {
    public static void main(String[] args) {
        // Testing F1 car
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

        // Testing Boat
        Boat yacht = new Boat("Yacht", 200);
        System.out.println("Boat Name: " + yacht.getVehicleName());
        System.out.println("Boat Capacity: " + yacht.getVehicleCapacity());
    }
}
