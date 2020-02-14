package Day10;

import java.util.Arrays;

public class searchRange {
    public static int[] searchRange(int[] nums, int target) {
        if(nums == null){
            return nums;
        }
        int left=0;
        int right=nums.length;
        while(left < right){
            int middle=(left+right)/2;
            if(nums[middle] == target){
                int right_index=middle;
                int left_index=middle;
                while( right_index+1 <= nums.length-1 && nums[right_index+1] == target){
                    right_index++;
                }
                while ( left_index-1 >=0 && nums[left_index-1] == target){
                    left_index--;
                }
                return new int[]{left_index,right_index};

            }else if(nums[middle] > target){
                if(right == middle){break;}
                 right=middle;
            }else {
                if(left == middle){
                    break;
                }
                left=middle;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] arr=new int[]{5,7,7,8,8,10}; //0  6  3
                                            //0  3  1
                                            //0  1  0
                                            //0  0  0


        System.out.println(Arrays.toString(searchRange(arr,6)));
    }
}
