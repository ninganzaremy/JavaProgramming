package wrapperClasses;

//Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

//The table below shows the primitive type and the equivalent wrapper class:

import java.util.ArrayList;

//Primitive Data Type	Wrapper Class
//byte	Byte
//short	Short
//int	Integer
//long	Long
//float	Float
//double	Double
//boolean	Boolean
//char	Character
public class WrapperClasses {
    public static void main(String[] args) {
        //Sometimes you must use wrapper classes, for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):
        //ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
        ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

        //Creating Wrapper Objects
        //To create a wrapper object, use the wrapper class instead of the primitive type. To get the value, you can just
        // print the object:
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        //certain methods are used to get information about the specific object.
        //
        //For example, the following methods are used to get the value associated with the corresponding wrapper
        // object: intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(),
        // booleanValue().

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());


        //Another useful method is the toString() method, which is used to convert wrapper objects to strings.

        Integer myInte = 100;
        String myString = myInte.toString();
        System.out.println(myString.length());

    }


}
