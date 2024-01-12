import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args){

        int[] nums = {8,4,5,2,7,6,0,619};
        System.out.println("The array is initially: " + Arrays.toString(nums));

        int[] sortedArr = bubbleSort(nums);
        System.out.println("The sorted array is: " + Arrays.toString(sortedArr));
    };

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
