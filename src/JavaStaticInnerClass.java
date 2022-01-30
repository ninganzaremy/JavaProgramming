//An inner class can also be static, which means that you can access it without creating an object of the outer class:
class OuterClassStatic {
    int x = 10;

    static class InnerClassStatic {
        int y = 5;
    }
}

public class JavaStaticInnerClass {
    public static void main(String[] args) {
        OuterClassStatic.InnerClassStatic myInner = new OuterClassStatic.InnerClassStatic();
        System.out.println(myInner.y);
    }
}

// Outputs 5