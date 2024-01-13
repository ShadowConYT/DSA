import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args){
        int[] arr = {7,8,5,1,7,3,4,0};
        System.out.println("Before Sorting: " + Arrays.toString(arr));

        int[] result = Selection(arr);
        System.out.println("After Sorting: " + Arrays.toString(result));
    };

    public static int[] Selection(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int minimum = i;

            for (int j = i+1; j < arr.length; j++ ){
                if (arr[j] < arr[minimum]){
                    minimum = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }

        return arr;
    }

}