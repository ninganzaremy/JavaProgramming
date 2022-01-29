public class JavaConstructors {
    // Create a class attribute
    int modelYear;
    String modelName;
    // Create a class constructor for the JavaConstructors class
    public JavaConstructors(int year, String name) {
        modelYear = year;
        modelName = name;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        JavaConstructors myObj = new JavaConstructors(1969, "Mustang"); // Create an object of class JavaConstructors (This will call the constructor)
        System.out.println(myObj.modelYear + " " + myObj.modelName); // Print the value of x
    }
}
