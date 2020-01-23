package Day5;


import java.util.HashSet;


public class containsDuplicate {
    public static  boolean containsDuplicate(int[] nums){
        HashSet<Integer> hashset=new HashSet<>(nums.length);
        for(int x:nums){
            if(hashset.contains(x)){
                return true;
            }
            hashset.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{'1'};
        System.out.println(containsDuplicate(nums));
    }
}
