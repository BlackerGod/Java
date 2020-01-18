package Day2;

import com.sun.deploy.net.proxy.RemoveCommentReader;

public class removeElement {
    public static int RemoveElement(int[] nums, int val) {
        if(nums ==null){
            return 0;
        }
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=val){
                nums[slow]=nums[fast];
                slow++;
            }
         }
         return slow;
    }

    public static void main(String[] args) {
        int[] nums=null;
        RemoveElement(nums,2);
    }
}
