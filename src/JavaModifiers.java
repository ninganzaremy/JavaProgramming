public class JavaModifiers {
    //For classes
    /*=============================*/
    //public:	The class is accessible by any other class
    //default:	The class is only accessible by classes in the same package.  This is used when you don't specify a modifier.

    //For attributes, methods and constructors,
    /*=============================*/
    //public	The code is accessible for all classes
    //private	The code is only accessible within the declared class
    //default	The code is only accessible in the same package. This is used when you don't specify a modifier.
    //protected	The code is accessible in the same package and subclasses.
    private String fname = "John";
    private String lname = "Doe";
    private String email = "john@doe.com";
    private int age = 24;

    public static void main(String[] args) {
        JavaModifiers myObj = new JavaModifiers();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}