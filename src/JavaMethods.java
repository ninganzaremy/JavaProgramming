public class JavaMethods {
    //Method
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
    static int myMathMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        //call th method
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
        int z = myMathMethod(5, 3);
        System.out.println(z);
    }
}
