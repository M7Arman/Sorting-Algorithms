package algoritms;

/**
 *
 * @author arman
 */
public class MergeSort {

    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int start, int end) {
        if (end == start) {
            return;
        }
        int center = (end + start) / 2;

        mergeSort(arr, start, center);
        mergeSort(arr, center + 1, end);

        merge(arr, start, center, end);
    }

    private void merge(int[] arr, int start, int center, int end) {
        if (arr[center + 1] >= arr[center]) {
            return;
        }
        int[] tmp = new int[end - start + 1];
        int i = start;
        int j = center + 1;
        for (int k = 0; k < tmp.length; k++) {
            if(j > end) {
                tmp[k] = arr[i++]; 
            } else if(i > center) {
                tmp[k] = arr[j++]; 
            } else if (arr[i] <= arr[j]) {
                tmp[k] = arr[i++];
            } else {
                tmp[k] = arr[j++];
            }
        }
        System.arraycopy(tmp, 0, arr, start, tmp.length);
    }

}
