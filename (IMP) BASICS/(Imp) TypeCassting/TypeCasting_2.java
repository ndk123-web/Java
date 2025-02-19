// Create an object of Car class and assign it to a Vehicle reference.
// Attempt to cast the Vehicle reference to Bike and call the ride method.
// Handle the ClassCastException that occurs due to incorrect type casting.

// Point here is to access the object of methods we need actual ref which is pointing to actual obj
// Means Bike ref point to Bike obj  and we can say  Car ref point to Car object
// But in this example superclass ref can be point to subclass object (Vehicle vehicle_ref1 = new Bike())
// But the problem is it will access only reference type class(Vehicle vehicle_ref1 = new Bike()) here Vehicle class
// It access methods in Compile time for safety like robustness 

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike rides");
    }
}

public class TypeCasting_2 {
    public static void main(String[] args) throws ClassCastException {

        Vehicle vehicle_ref1 = new Bike();  // actual object Bike and refernce superclass

        Vehicle vehical_ref2 = new Car();   // actual objetc car and reference superclass

        Bike bike = (Bike) vehicle_ref1;

        bike.ride();

        Car car = (Car) vehical_ref2;

        car.drive();

    }
}
