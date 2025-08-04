package oopsConcept;

public class LearnInterface
{
    public static void main(String[] args)
    {
        NewCar car = new NewCar();
        //car.MAX_SPEED = 150; // This will not change the MAX_SPEED in the interface, as it is final
        car.start();
        car.accelerate();
        car.brake();
        car.stop();
    }
}


interface Vehicle {
    public static  int MAX_SPEED = 120; // variables are final in an interface

    void start();
    void stop();
    void accelerate();
    void brake();

    // Default method in an interface
    // This method can be overridden by implementing classes if needed
    // If not overridden, the default implementation will be used
    // Default methods were introduced in Java 8 to allow adding new methods to interfaces without breaking

    default void honk() {
        System.out.println("Vehicle is honking");

    }
}


interface VehicleWithAirConditioning
{
    void turnOnAirConditioning();
    void turnOffAirConditioning();
}


class NewCar implements Vehicle, VehicleWithAirConditioning
{
    @Override
    public void start()
    {
        System.out.println("NewCar is starting");
    }

    @Override
    public void stop()
    {
        System.out.println("NewCar is stopping");
    }

    @Override
    public void accelerate()
    {
        System.out.println("NewCar is accelerating");
        System.out.println("Max Speed: " + MAX_SPEED + " km/h");
        //MAX_SPEED++; // This line will cause a compile-time error because MAX_SPEED is final
    }

    @Override
    public void brake()
    {
        System.out.println("NewCar is braking");
    }

    @Override
    public void turnOnAirConditioning()
    {
        System.out.println("Turning on air conditioning in NewCar");
    }

    @Override
    public void turnOffAirConditioning()
    {
        System.out.println("Turning off air conditioning in NewCar");
    }
}
//  The NewCar class implements both Vehicle and VehicleWithAirConditioning interfaces,
// providing concrete implementations for all methods defined in both interfaces.
// This allows NewCar to be treated as both a Vehicle and a VehicleWithAirConditioning,
// demonstrating the concept of multiple inheritance through interfaces in Java.


