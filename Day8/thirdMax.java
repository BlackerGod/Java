package Day8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class thirdMax {
    public static int thirdMax(int[] nums) {
        Set<Integer> hashset=new HashSet<>(nums.length);
        for(int i=0;i<nums.length;i++){
            hashset.add(nums[i]);
        }

        int[] result=new int[hashset.size()];
         Object[] o= hashset.toArray();
        for(int i=0;i<result.length;i++){
            result[i]=(int)o[i];
        }
        Arrays.sort(result);
        if(result.length<=2){
            return result[result.length-1];
        }
        return result[result.length-3];
    }

    public static void main(String[] args) {
        int[] arr=new int[]{3,2,1,2};
        System.out.println(thirdMax(arr));
    }
}
