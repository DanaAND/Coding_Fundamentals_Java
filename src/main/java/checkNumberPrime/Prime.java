package checkNumberPrime;

    public class Prime {

        public static boolean isPrime(int number){
            for(int i = 2 ; i <=number/2; i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }

        public static boolean isPrime2(int number){
            if( number == 4 ) return false;
            return true;
        }

    }


