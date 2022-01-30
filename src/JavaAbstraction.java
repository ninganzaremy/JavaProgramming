//Data abstraction is the process of hiding certain details and showing only essential information to the user.
//The abstract keyword is a non-access modifier, used for classes and methods:
//
//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited
// from another class).
//
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the
// subclass (inherited from).
//An abstract class can have both abstract and regular methods:
// Abstract class
abstract class Animals {
    // Abstract method (does not have a body)
    public abstract void animalSound();
    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherit from Animal)
class Pigs extends Animals {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class JavaAbstraction {
    public static void main(String[] args) {
        Pigs myPig = new Pigs(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
//Why And When To Use Abstract Classes and Methods?
//To achieve security - hide certain details and only show the important details of an object.
