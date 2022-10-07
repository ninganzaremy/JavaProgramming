final class Vehicles {
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

//cannot inherit from final Vehicles
//class AccessTest extends Vehicles {
//    private String modelName = "Mustang";
//    public static void main(String[] args) {
//        AccessTest myFastCar = new AccessTest();
//        myFastCar.honk();
//        System.out.println(myFastCar.brand + " " + myFastCar.modelName);
//    }
//}
