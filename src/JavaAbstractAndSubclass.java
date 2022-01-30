     //Code from filename: Main.java
    // abstract class
    abstract class JavaAbstractAndSubclass {
        public String fname = "John";
        public String lname = "Doe";
        public String email = "john@doe.com";
        public int age = 24;
        public abstract void study(); // abstract method
    }

    // Subclass (inherit from JavaProtectedAttributes)
    class Student extends JavaAbstractAndSubclass {
        public int graduationYear = 2018;

        public void study() {
            System.out.println("Studying all day long");
        }
    }
    // End code from filename: JavaAbstractAndSubclass.java
    // Code from filename: Second.java

    class Seconds {
        public static void main(String[] args) {
            // create an object of the Student class (which inherits attributes and methods from JavaAbstractAndSubclass)
            Student myObj = new Student();

            System.out.println("Name: " + myObj.fname);
            System.out.println("Age: " + myObj.age);
            System.out.println("Graduation Year: " + myObj.graduationYear);
            myObj.study(); // call abstract method
        }
    }

