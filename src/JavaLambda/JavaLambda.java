package JavaLambda;

import java.util.ArrayList;
import java.util.function.Consumer;

//To use more than one parameter, wrap them in parentheses:
//(parameter1, parameter2) -> expression
//Use a lamba expression in the ArrayList's forEach() method to print every item in the list:


interface StringFunction {
    String run(String str);
}

public class JavaLambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n); } );

        //Use Java's Consumer interface to store a lambda expression in a variable:
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(5);
        myNumbers.add(9);
        myNumbers.add(8);
        myNumbers.add(1);
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        myNumbers.forEach(method);


        //To use a lambda expression in a method, the method should have a parameter with a single-method interface as its
        // type. Calling the interface's method will run the lambda expression:
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);


    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }



}
