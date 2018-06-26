package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;

/**
 * @author linahovanessian on 6/25/18.
 */
public class MyModAppDemo {

    public static void main(String[] args) {

        if (SimpleMathFuncs.isFactor( 2, 10 ))
            System.out.println( "2 divisor 10" );

        System.out.println( "The smallest common divisor is 35 and 105:" +
                SimpleMathFuncs.lcf( 35, 105 ) );

        System.out.println( "The greatest common divisor is 35 and 105:" +
                SimpleMathFuncs.gcf( 35, 105 ) );
    }
}
