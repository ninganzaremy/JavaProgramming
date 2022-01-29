public class JavaOop {
    //To create an object of Main, specify the class name, followed by the object name, and use the keyword new:
    //creating an SAttribute
    int x = 5;
    int y = 7;
    //If you don't want the ability to override existing values, declare the attribute as final:
    final int w = 10;


    public static void main(String[] args) {
        //creating an object
        JavaOop myObj1 = new JavaOop();  // Object 1
        JavaOop myObj2 = new JavaOop();  // Object 2
        //Accessing Attributes and modifying them
        myObj2.y = 45;
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
    }
}
