public class LinearSearch {

    public static void main(String[] args){
        int nums[] = {0,6,1,9};
        int target = 6;

        int result = linear(nums, target);
        
        if (result != -1)
            System.out.println("The Element found in the Index: " + result);
        else
            System.out.println("The Element not found");
    };

    public static int linear(int[] nums, int target){
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

};