package hashMap;
//A HashMap store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).

public class WriteHashMap {
    public static void main(String[] args) {
        //Create a HashMap object called capitalCities that will store String keys and String values:
        java.util.HashMap<String, String> capitalCities = new java.util.HashMap<String, String>();

        //Add Items
        //The HashMap class has many useful methods. For example, to add items to it, use the put() method:
        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        //Access an Item
        //To access a value in the HashMap, use the get() method and refer to its key:
        String myCity = capitalCities.get("England");
        System.out.println(myCity);

        //Remove an Item
        //To remove an item, use the remove() method and refer to the key:
        capitalCities.remove("England");
        System.out.println(capitalCities);

        //Remove all items
        //To remove all items, use the clear() method:
        // capitalCities.clear();
        System.out.println(capitalCities);

        //HashMap Size
        //To find out how many items there are, use the size() method:
        capitalCities.size();
        int myCitySize = capitalCities.size();
        System.out.println(myCitySize);

        //Loop Through a HashMap
        //Loop through the items of a HashMap with a for-each loop.
        //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        //Other Types
        //Remember that a String in Java is an object (not a primitive type)
        //To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double

        // Create a HashMap object called people
        java.util.HashMap<String, Integer> people = new java.util.HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }


    }
}
