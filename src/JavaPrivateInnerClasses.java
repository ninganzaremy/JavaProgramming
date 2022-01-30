//Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:
class OuterClassTwo {
    int x = 10;

    private class InnerClassPrivate {
        int y = 5;
    }
}
//error: OuterClass.InnerClass has private access in OuterClass
//public class JavaPrivateInnerClasses {
//    public static void main(String[] args) {
//        OuterClassTwo myOuter = new OuterClassTwo();
//        OuterClassTwo.InnerClassPrivate myInner = myOuter.new InnerClassPrivate();
//        System.out.println(myInner.y + myOuter.x);
//    }
//}
