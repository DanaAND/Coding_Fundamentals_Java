package coding;

public class ArrayMaxNo {
    // scrieti un programn java care sa gaseasca cel mai mare element "k" intr-un array. elementele din array pot fi in orice ordine.


    public static void main(String[] args) {

        int myArray[] = {10, 324, 45, 90, 100};

        int noOfMax= 3;

        for(int i = 0; i<noOfMax; i++) {
            int max = getMyArrayMax(myArray);
            System.out.println(max);

            myArray = removeAnyNumber(max, myArray);
        }

    }

    public static int getMyArrayMax( int [] array) {


        int k = 0;

        for (int i = 0; i<array.length; i++){

            if (array[i] > k)

            k = array[i];

        }

        return k;

    }

    public static int[] removeAnyNumber (int element, int [] oldArray) {

        int index = 0;

        int [] newArray = new int [oldArray.length-1];

        for (int i =0; i< oldArray.length; i++){
            if (element != oldArray[i]){
                newArray[index] = oldArray[i];
                index ++;
            }

        }

        return newArray;
    }


}



