import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){

        int[] nums = {8,4,5,2,7,6,0,15,619};

        int[] sortedArr = bubbleSort(nums);
        System.out.println("The array is initially: " + Arrays.toString(nums));
        System.out.println("The sorted array is: " + Arrays.toString(sortedArr));
    };

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length - 1; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
