package Day4;

import java.util.Arrays;

public class merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]==0){
                if(n>=0){
                    nums1[i]=nums2[n-1];
                    n--;
                }else{
                    break;
                }
            }
        }
        Arrays.sort(nums1);

    }
}
