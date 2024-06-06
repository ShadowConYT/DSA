import java.util.Arrays;
public class AllSort {

    public static void main(String[] args){
        int[] toSort = {12, 4, 5, 7, -9, 0};
        int n = toSort.length;

        // Sorting Algos
        int[] insertion = insertionSort(toSort, n);


        System.out.println(Arrays.toString(insertion));
    }

    public static int[] insertionSort(int[] arr, int n) {
        int j;
        for ( int i = 1; i < n; i++)
        {
            j = i - 1;
            int key = arr[i];

            while ( j >= 0 && key < arr[j] )
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
        return arr;
    }
}