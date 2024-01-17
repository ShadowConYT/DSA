import java.util.Arrays;

public class quickSort{
    public static void main(String[] args){
        int[] arr = {5,3,6,1,4,2};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        int[] result = quicksort(arr, 0, arr.length - 1);
        System.out.println("After Sorting: " + Arrays.toString(result));
    }

    public static int[] quicksort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);

            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++){
            if (arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp2 = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp2;
        return i + 1;
    }
}