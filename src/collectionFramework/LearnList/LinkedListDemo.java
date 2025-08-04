package collectionFramework.LearnList;

import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        // Create a linked list
        // Doubly linked list implementation in Java
        LinkedList<String> linkedList = new java.util.LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Mango");

        // Display the linked list
        System.out.println("Linked List: " + linkedList);

        // Access elements in the linked list
        String firstElement = linkedList.get(0);
        System.out.println("First Element: " + firstElement);

        String secondElement = linkedList.get(1);
        System.out.println("Second Element: " + secondElement);

        // Add an element at a specific position
        linkedList.add(1, "Orange");
        System.out.println("After adding Orange at index 1: " + linkedList);


        // Remove an element from the linked list
        linkedList.remove("Banana");
        System.out.println("After removing Banana: " + linkedList);

        // Check if an element exists in the linked list
        boolean containsCherry = linkedList.contains("Cherry");
        System.out.println("Contains Cherry: " + containsCherry);

    }
}
