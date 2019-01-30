package bubbleSort;

public class BubbleSort {


    int[] bubbleSort(int[]a) {
        int i, step;

        for(step=0; step < a.length-1; ++step)
            for(i=0; i < a.length-step-1; ++i) {
                if (a [i] > a[i+1]) {
                    int aux = a[i];
                    a[i] = a[i+1];
                    a[i+1] = aux;
                }
            }
        return a;
    }

}

