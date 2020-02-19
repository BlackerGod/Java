package Day12;

import java.util.Arrays;

public class findUnsortedSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        if(nums == null || nums.length == 1){
            return 0;
        }
        int left=0;
        int right=0;
        flag:  for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]) {
                    left = i;
                    break flag;
                }
            }
        }
        tt:for(int i=nums.length-1;i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(nums[i]<nums[j]) {
                    right =i+1;
                    break tt;
                }
            }
        }
        return right-left;
    }

    public static void main(String[] args) {
        System.out.println(findUnsortedSubarray(new int[]{1,2,3,4}));
    }
}
