package collectionFramework.LearnList;

import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args)
    {
        // Create a stack
        Stack<String> stack = new java.util.Stack<>();

        // Push elements onto the stack
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.add(2,"Fourth"); // Adding at a specific position

        // Display the stack
        System.out.println("Stack: " + stack);

        // Peek at the top element
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        //get element at any position
        String elementAtPosition = stack.get(2); // Get the element at index 2
        System.out.println("Element at position 2: " + elementAtPosition);

        // Pop an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Display the stack after popping
        System.out.println("Stack after pop: " + stack);

    }
}
