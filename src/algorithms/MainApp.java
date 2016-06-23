package algorithms;

/**
 *
 * @author arman
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        testMergeSort(new int[] {10, 34, 2, 2, 56, 7, 67, 88, 42});
        testInsertionSort(new int[] {10, 34, 2, 2, 56, 7, 67, 88, 42});
    }
    
    private static void testMergeSort(int[] arr) {
        printArray("Array: ", arr);
        MergeSort ms = new MergeSort();
        ms.sort(arr);
        printArray("After Merge sort: ", arr);
    }
    
    private static void testInsertionSort(int[] arr) {
        printArray("Array: ", arr);
        InsertionSort.ascendingSort(arr);
        printArray("Ascending insertion sort: ", arr);
        InsertionSort.descendingSort(arr);
        printArray("Descending insertion sort: ", arr);
    }
    public static void printArray(String str, int[] arr) {
        System.out.println("\n------------");
        System.out.print(str);
        for (int item : arr) {
            System.out.print(item);
            System.out.print(", ");
        }
        System.out.println();
    }

}
