public class JavaScope {
    public static void main(String[] args) {
        //In Java, variables are only accessible inside the region they are created. This is called scope.
        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x = 0;
            try {
                x = 100;
            } catch (Exception e) {
                e.printStackTrace();
            }

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x

        //Java Recursion
        //is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }
    //Example Explained
    /* 10 + sum(9)
    10 + ( 9 + sum(8) )
    10 + ( 9 + ( 8 + sum(7) ) )
    ...
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 */
}
