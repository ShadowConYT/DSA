import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {5, 2, 4, 6, 1, 3};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        int[] result = insertionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(result));
    }

    public static int[] insertionSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
