//Create a Java program to model different types of vehicles using interfaces for multiple inheritance. 
//Define interfaces for Drivable, FuelConsumable, and Displayable. 
//Implement these interfaces in classes Car and Bicycle. 
//Each interface should have methods specific to its functionality.
//Drivable: Should have methods like start(), accelerate(), and stop().
//FuelConsumable: Should have methods like refuel().
//Displayable: Should have methods like displayInfo().

import java.sql.DriverAction;

interface Drivable {
    void start();

    void accelerate();

    void stop();
}

interface FuelConsumable {
    void refuel();
}

interface Displayable {
    void displayInfo();
}

class Car implements Drivable, FuelConsumable, Displayable {

    public void start() {
        System.out.println("Car is Starting");
    }

    public void accelerate() {
        System.out.println("Car is Acclerating");
    }

    public void stop() {
        System.out.println("Car is Stopped");
    }

    public void refuel() {
        System.out.println("Car is Fueling");
    }

    public void displayInfo() {
        start();
        accelerate();
        stop();
        refuel();
        System.out.println();
    }
}

class Bicycle implements Drivable, FuelConsumable, Displayable {
    public void start() {
        System.out.println("Bicycle is Starting");
    }

    public void accelerate() {
        System.out.println("Bicycle is Acclerating");
    }

    public void stop() {
        System.out.println("Bicycle is Stopped");
    }

    public void refuel() {
        System.out.println("Bicycle  Pedaling");
    }

    public void displayInfo() {
        start();
        accelerate();
        stop();
        refuel();
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {

        Car c = new Car();
        Bicycle b = new Bicycle();

        c.displayInfo();
        b.displayInfo();

    }
}
