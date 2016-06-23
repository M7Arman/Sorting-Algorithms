package algorithms;

public class InsertionSort {
    
    public static int[] ascendingSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int buff = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = buff;
                } else {
                    break;
                }
            }
        }
        return a;
    }

    public static int[] descendingSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] > a[j - 1]) {
                    int buff = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = buff;
                } else {
                    break;
                }
            }
        }
        return a;
    }
}
