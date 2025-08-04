package oopsConcept;

public class ClassDemo
{
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car mg = new Car();
        Car mercedes = new Car();

        // Setting details for the MG car
        mg.color = "Red";
        mg.model = "MG Astor";
        mg.year = 2022;
        // Displaying details of the MG car
        System.out.println("Details of MG car:");
        mg.displayDetails();


        // Setting details for the Mercedes car
        mercedes.color = "Black";
        mercedes.model = "Mercedes Benz";
        mercedes.year = 2023;
        // Displaying details of the Mercedes car
        System.out.println("Details of Mercedes car:");
        mercedes.displayDetails();
    }

    static class Car
    {
        public String model;
        public int year;
        public String color;

        // Method to display car details
        public void displayDetails()
        {
            System.out.println("Car Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Color: " + color);
        }
    }

}

