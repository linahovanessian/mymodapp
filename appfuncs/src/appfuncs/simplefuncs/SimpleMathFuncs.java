package appfuncs.simplefuncs;

/**
 * @author linahovanessian on 6/25/18.
 */
public class SimpleMathFuncs {
    // Determine if a is a divisor b
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        return false;
    }

    // Return the smallest common divisor for a and b
    public static int lcf(int a, int b) {
        // use positive numbers
        a = Math.abs( a );
        b = Math.abs( b );

        int min = a < b ? a : b;

        for (int i = 2; i <= min / 2; i++) {
            if (isFactor( i, a ) && isFactor( i, b )) {
                return i;
            }
        }

        return 1;
    }

    // Return the largest common divisor
    public static int gcf(int a, int b) {
        // use positive numbers
        a = Math.abs( a );
        b = Math.abs( b );

        int min = a < b ? a : b;

        for (int i = min / 2; i >= 2; i--) {
            if (isFactor( i, a ) && isFactor( i, b ))
                return i;
        }

        return 1;
    }
}

