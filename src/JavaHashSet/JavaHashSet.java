package JavaHashSet;

//Java HashSet
//A HashSet is a collection of items where every item is unique, and it is found in the java.util package:

import java.util.HashSet; // Import the HashSet class

public class JavaHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        //Add Items
        //The HashSet class has many useful methods. For example, to add items to it, use the add() method:
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);
        //Note: In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.


        //Check If an Item Exists
        //To check whether an item exists in a HashSet, use the contains() method:
        System.out.println(cars.contains("Mazda"));

        //Remove an Item
        //To remove an item, use the remove() method
        cars.remove("Volvo");
        System.out.println(cars);

        //HashSet Size
        //To find out how many items there are, use the size method:
        cars.size();


        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }


        }
    }
}
