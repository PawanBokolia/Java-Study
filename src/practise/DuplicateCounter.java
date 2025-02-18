package practise;
import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateCounter {
    public static void main(String[] args) {
        // Example list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(5);
        numbers.add(8);
        numbers.add(8);

        // HashMap to store counts
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences
        for (int num : numbers) 
        {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Print all numbers and their counts in the order of appearance
        System.out.println("Number counts (in order):");

        
        for (int key : countMap.keySet())
        {
                System.out.println(key + " -> " + countMap.get(key));
        }
    }
}
