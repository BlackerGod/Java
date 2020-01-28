package Day7;

public class pivotIndex {
    public static int pivotIndex(int[] nums) {
    int sum=0;
    int leftsum=0;
    for(int x: nums){
        sum += x;
    }
    for(int i=0;i<nums.length;i++){
        if(sum-leftsum-nums[i] == leftsum){
            return i;
        }
        leftsum +=nums[i];
    }
    return  -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1,-1,-1,-1,0};
        System.out.println(pivotIndex(nums));
    }
}
