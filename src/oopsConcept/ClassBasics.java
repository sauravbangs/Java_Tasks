package oopsConcept;

public class ClassBasics
{
    public static void main(String[] args)
    {
        // Creating an obect of the Student class
        Student student = new Student();

        // Setting student details
        student.name = "Saurabh";
        student.age = 20;
        student.rollNumber = 101;

        // Displaying student details
        student.displayDetails();

        // Creating another object of the Student class
        Student anotherStudent = new Student();

        // Setting another student's details
        anotherStudent.name = "Rahul";
        anotherStudent.age = 22;
        anotherStudent.rollNumber = 102;

        // Displaying another student's details
        anotherStudent.displayDetails();


        // Creating an object of the Teacher class
        Teacher teacher = new Teacher();

        // Setting teacher details
        teacher.name = "Mr. R D Sharma";
        teacher.age = 35;
        teacher.subject = "Mathematics";

        // Displaying teacher details
        teacher.displayDetails();


        // Creating another object of the Teacher class
        Teacher anotherTeacher = new Teacher();

        // Setting another teacher's details
        anotherTeacher.name = "Mr. H C Verma";
        anotherTeacher.age = 30;
        anotherTeacher.subject = "Physics";
        // Displaying another teacher's details
        anotherTeacher.displayDetails();

    }
}

//class student with student name, age, and roll number
class Student
{
    public String name;
    public int age;
    public int rollNumber;

    //method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher
{
    public String name;
    public int age;
    public String subject;

    //method to display teacher details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}


