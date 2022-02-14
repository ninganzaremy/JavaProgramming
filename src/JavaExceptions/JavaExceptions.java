package JavaExceptions;

public class JavaExceptions {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
    public static void main(String[] args) {

        //If an error occurs, we can use try...catch to catch the error and execute some code to handle it:

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[1]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        //Finally
        //The finally statement lets you execute code, after try...catch, regardless of the result:
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        //The throw keyword
        //The throw statement allows you to create a custom error.
        //The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
        checkAge(15); // Set age to 15 (which is below 18...)
    }

}
