import java.util.Arrays;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(Arrays.toString(nums));
        removeElement(nums, 3);
        
        

    }
}