package insertionSort;

public class MyInsertion {

    public void insertionSort ( int [] list) {

        int j, sort;

         for ( int i = 1; i < list.length; i++){

            sort = list[i];
            j = i - 1;

            while (j >=0 && list[j] > sort) {
                list[j + 1] = list [j];
                j --;
            }
            list[j+1]=sort;
         }
    }
}
