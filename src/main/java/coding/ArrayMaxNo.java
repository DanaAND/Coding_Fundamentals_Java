//package coding;
//
//public class ArrayMaxNo {
//    // scrieti un programn java care sa gaseasca cel mai mare element "k" intr-un array. elementele din array pot fi in orice ordine.
//
//
//    public static void main(String[] args) {
//        int myArray[] = {10, 324, 45, 90, 100};
//        int noOfMax= 4;
//
//        for(int i = 0; i<noOfMax; i++) {
//            int max = getMyArrayMax(myArray);
//            System.out.println(max);
//            myArray = removeAnyNumber(max, myArray);
//        }
//
//    }
//
//    public static int getMyArrayMax( int [] array) {
//        int i, aux, step;
//        for (i = 0; i<array.length -1; ++i){
//            for (step =0; step<array.length-i-1;++step)
//            if (array[i] > array[i+1])
//                aux = array[i];
//                array[i] = array [i+1];
//                array[i+1] = aux
//        }
//        return i;
//
//    }
//
//    public static int[] removeAnyNumber (int element, int [] oldArray) {
//        int index = 0;
//        int [] newArray = new int [oldArray.length-1];
//        for (int i =0; i< oldArray.length; i++){
//            if (element != oldArray[i]){
//                newArray[index] = oldArray[i];
//                index ++;
//            }
//        }
//        return newArray;
//    }
//
//}
//
//
//
