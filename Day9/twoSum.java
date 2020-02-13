package Day9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] num=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    num[0]=i;
                    num[1]=j;
                    return num;
                }
            }
        }
        return null;
    }
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> hashmap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hashmap.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int result=target-nums[i];
            if(hashmap.containsKey(result) && hashmap.get(result) != i){
                return nums=new int[]{i,hashmap.get(result)};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum2(arr,9)));
    }
}

