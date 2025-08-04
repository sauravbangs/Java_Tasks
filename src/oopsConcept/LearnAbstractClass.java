package oopsConcept;

public class LearnAbstractClass
{
    public static void main(String[] args)
    {
       // AbstractClassVehicle vehicle = new Car();
        Car car = new Car();
        car.start();
        car.brake();
        car.stop();
        car.MAX_SPEED = 150;
        car.accelerate();
        car.honk();
    }
}

abstract class AbstractClassVehicle
{
    int MAX_SPEED = 120; // This can be overridden in subclasses
    abstract void start();
    abstract void stop();
    abstract void accelerate();
    abstract void brake();
    // Abstract methods must be implemented by subclasses
    // Abstract methods do not have a body and are declared with the 'abstract' keyword


    // You can also have a concrete method in an abstract class
    public void honk()
    {
        System.out.println("Vehicle is honking");
    }

}

class Car extends AbstractClassVehicle
{
    @Override
    void start()
    {
        System.out.println("Car is starting");
    }

    @Override
    void stop()
    {
        System.out.println("Car is stopping");
    }

    @Override
    void accelerate()
    {
        System.out.println("Car is accelerating");
        System.out.println("Max Speed: " + MAX_SPEED + " km/h");

    }

    @Override
    void brake()
    {
        System.out.println("Car is braking");
    }
    //@Override
//    public void honk()
//    {
//        System.out.println("Car is honking");
//    }
}
