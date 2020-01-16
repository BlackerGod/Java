package Day1;

public class rotate {
    public static void Rotate(int[] nums, int k) {
        if (nums == null || k <= 0 || nums.length == k || nums.length == 1) {
            return;
        }
        int[] tmp = new int[nums.length];
        if(k>nums.length){
            k=k%nums.length;
        }
        int index=nums.length-k;
        int i=0;
        while (i<tmp.length){
            if(index  == nums.length){
                index=0;
            }
            tmp[i++]=nums[index++];
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=tmp[j];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Rotate(arr,3);
    }
}
