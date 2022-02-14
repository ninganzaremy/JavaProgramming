package JavaLinkedList;
// Import the LinkedList class
import java.util.LinkedList;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        //For many cases, the ArrayList is more efficient as it is common to need access to random items in the list,
        // but the LinkedList provides several methods to do certain operations more efficiently:

        //Method	Description
        //addFirst()	Adds an item to the beginning of the list.
        //addLast()	Add an item to the end of the list
        //removeFirst()	Remove an item from the beginning of the list.
        //removeLast()	Remove an item from the end of the list
        //getFirst()	Get the item at the beginning of the list
        //getLast()	Get the item at the end of the list

    }
}
