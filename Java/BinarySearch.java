import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){
        int nums[] = {0,6,1,9};
        // Note that Binary Search works on Sorted Array only
        
        int target = 1;

        int result = binaryRecursion(nums, target, 0, nums.length-1);

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

    // binary recursion

    public static int binaryRecursion(int[] nums, int target, int low, int high){
        Arrays.sort(nums);
        if (low <= high){
            int mid = (low + high) / 2;

            if (nums[mid] == target){
                return mid;
            }
            // [1,2,3,4,5,6]
            else if (nums[mid] < target){
                return binaryRecursion(nums, target, mid+1, high);
            }
            else{
                return binaryRecursion(nums, target, low, mid-1);
            }
        }
        return -1;
    }
}
