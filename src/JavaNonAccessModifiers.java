final class JavaNonAccessModifiers {

    //Non-Access Modifiers
    //For classes, you can use either final or abstract:
    /*=============================================================*/

    //final	The class cannot be inherited by other classes
    //abstract	The class cannot be used to create objects (To access an abstract class, it must be inherited from
    // another class.
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

//class Main extends JavaNonAccessModifiers {     //error expected: cannot inherit from final JavaNonAccessModifiers
//    private String modelName = "Mustang";
//
//    public static void main(String[] args) {
//        Main myFastCar = new Main();
//        myFastCar.honk();
//        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
//    }
//}


