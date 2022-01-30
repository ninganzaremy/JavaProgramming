public class Main {
    public static void main(String[] args){
        System.out.println("Hello Java");
        //Java data types
        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        //java Strings Methods
        String txt = "Hello World";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"
        System.out.println(txt.indexOf("World")); // Outputs 6

        //Short Hand If...Else (Ternary Operator)
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        //Java Switch Statements
        int day = 4;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
       // Outputs "Looking forward to the Weekend"
        //Java While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        //The Do/While Loop
        do {
            System.out.println(i);
            i++;
        }
        while (i < 9);

        //Java For Loop
        for (i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }
        // For-Each Loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String x : cars) {
            System.out.println(x);
        }
        //Java Break
        while (i < 13) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
        //Java Continue
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        //Java Arrays
        String[] vehicles = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(vehicles[0]);
        //Change an Array Element
        vehicles[0]= "Toyota";
        //Array Length
        System.out.println(vehicles.length);
        //Loop Through an Array with For-Each
        for (String car : cars) {
            System.out.println(car);
        }
        //Multidimensional Arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

        JavaEncapsulation myObj = new JavaEncapsulation();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }

}
