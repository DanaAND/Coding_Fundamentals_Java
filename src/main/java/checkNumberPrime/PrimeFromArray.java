package checkNumberPrime;

import java.util.ArrayList;

public class PrimeFromArray {

    public static ArrayList findPrime(int [] x ) {

  //      int[] array = {1, 4, 6, 8, 3, 0, 6};

        ArrayList verify = new ArrayList();
        verify.toString();

        for (int i = 0; i < x.length; i++) {
            if (Prime.isPrime(x[i])){
                verify.add(x[i]);

            }
        }
        return  verify;
    }

}
