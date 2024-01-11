import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int nums[] = {0,6,1,9};
        // Note that Binary Search works on Sorted Array only
        
        int target = 1;

        int result = binary(nums, target);

        if (result != -1)
            System.out.println("The Element found in the Index: " + result);
        else
            System.out.println("The Element not found");
    }

    public static int binary(int[] nums, int target){
        
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target ){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return -1;

    }
}
