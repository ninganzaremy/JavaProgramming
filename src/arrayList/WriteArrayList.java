package arrayList;
//The ArrayList class is a resizable array, which can be found in the java.util package.
//Create an ArrayList object called cars that will store strings:

import java.util.*;

public class WriteArrayList {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

        //Add Items
        //The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method:

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);


        //Access an Item
        //To access an element in the ArrayList, use the get() method and refer to the index number:
        cars.get(0);
        System.out.println(cars);


        //Change an Item
        //To modify an element, use the set() method and refer to the index number:

        cars.set(0, "Opel");
        System.out.println(cars);

        //Remove an Item
        //To remove an element, use the remove() method and refer to the index number:
        cars.remove(0);
        System.out.println(cars);

        //Remove all the elements
        //To remove all the elements in the ArrayList, use the clear() method:
        //cars.clear();
        System.out.println(cars);

        //ArrayList Size
        //To find out how many elements an ArrayList have, use the size method:
        cars.size();
        System.out.println(cars.size());

        //Loop Through an ArrayList
        //Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many
        // times the loop should run:
        //For

        for (int i = 0; i < cars.size(); i++) {
            System.out.println("For loop outputs: " + cars.get(i));
        }

        //For Each
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("For Each outputs: " + cars.get(i));
        }


        //Other Types
        //Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type
        // "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as
        // int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for
        // boolean, Character for char, Double for double:

        java.util.ArrayList<Integer> myNumbers = new java.util.ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        //Sort an ArrayList
        //Another useful class in the java.util package is the Collections class, which include the sort() method for
        // sorting lists alphabetically or numerically:

        Collections.sort(cars);  // Sort cars
        for (String i : cars) {
            System.out.println(i);
        }
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers
        for (int i : myNumbers) {
            System.out.println(i);
        }


    }


}
