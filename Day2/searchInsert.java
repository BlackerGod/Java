package Day2;

public class searchInsert {
    public int SearchInsert(int[] nums, int target) {
        if(nums == null){
            return 0;
        }
        for(int i=0;i<nums.length;i++) {
            if (nums[i] >= target) {
                return i;
            } else  if (i != nums.length-1 && nums[i+1]>= target){
                return i+1;
            }
        }
        return nums.length;
    }
}
