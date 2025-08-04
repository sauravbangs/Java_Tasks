package collectionFramework.LearnList;

import java.util.HashSet;
import java.util.Set;

public class SetDemo
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println("Initial Set: " + set);
        // set doesn't follow any specific order
        // It allows null values and does not allow duplicate elements

        // Attempting to add a duplicate element
        boolean isAdded = set.add(2);
        if (!isAdded) {
            System.out.println("Element 2 is already present in the set, so it was not added again.");
        }

        //LinkedHashSet example
        // LinkedHashSet maintains insertion order
        // It is a combination of HashSet and LinkedList
        // It allows null values and does not allow duplicate elements
        Set<Integer> linkedHashSet = new HashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(7);
        linkedHashSet.add(8);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        linkedHashSet.add(5); // Adding a duplicate element
        System.out.println("After attempting to add a duplicate element: " + linkedHashSet);

        //TreeSet example
        // TreeSet is a part of the Java Collections Framework
        // It implements the Set interface and uses a tree structure to store elements
        // It does not allow null values and does not allow duplicate elements
        // It sorts the elements in sorted order

        Set<Integer> treeSet = new HashSet<>();
        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(8);
        treeSet.add(7);
        System.out.println("TreeSet: " + treeSet);



    }
}
