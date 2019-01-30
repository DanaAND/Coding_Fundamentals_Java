package coding;

import java.util.Arrays;

public class OddNumbers {

    public static void main(String[] args) {
        int[] list = {3, 6, 4, 7, 9, 12, 30};
        oddNumbers(list);
    }

    private static void oddNumbers( int [] no3){
        int odd = 0;
        for(int i = 0; i< no3.length; i++){
            if(no3[i] % 2 == 0) {
                odd = i;
                System.out.println(no3[i]);
            }
        }
    }
}


