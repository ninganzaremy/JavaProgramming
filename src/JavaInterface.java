//Another way to achieve abstraction in Java, is with interfaces.
//
//An interface is a completely "abstract class" that is used to group related methods with empty bodies:
//To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class:
// Interface
interface MyAnimal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Piggs implements MyAnimal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

class JavaInterface {
    public static void main(String[] args) {
        Piggs myPig = new Piggs();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}