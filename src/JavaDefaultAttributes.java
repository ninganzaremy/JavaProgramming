public class JavaDefaultAttributes {
    //default	The code is only accessible in the same package. This is used when you don't specify a modifier.
    String fname = "John";
    String lname = "Doe";
    String email = "john@doe.com";
    int age = 24;

    public static void main(String[] args) {
        JavaDefaultAttributes myObj = new JavaDefaultAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}
