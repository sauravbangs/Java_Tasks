package collectionFramework.LearnList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListDemo
{
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Remove an element from the queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Peek at the front element of the queue
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);
    }
}
