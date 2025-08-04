package collectionFramework.LearnList;

import java.util.HashMap;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Access a value using its key
        int value = map.get("Two");
        System.out.println("Value for key 'Two': " + value);

        // Check if a key exists
        boolean hasKey = map.containsKey("One");
        System.out.println("Contains key 'One': " + hasKey);

        map.putIfAbsent("Four", 4);
        System.out.println("HashMap after putIfAbsent: " + map);

        // Remove a key-value pair
        map.remove("Three");
        System.out.println("HashMap after removing 'Three': " + map);

        // Iterate over the HashMap
        System.out.println("Iterating over HashMap:");
        for (String key : map.keySet())
        {
            int val = map.get(key);
            System.out.println("Key: " + key + ", Value: " + val);

        }
    }
}
