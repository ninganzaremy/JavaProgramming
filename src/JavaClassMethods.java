public class JavaClassMethods {
    //Static vs. Non-Static
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        JavaClassMethods myObj = new JavaClassMethods(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method on the object
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
}
