package Day13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class subsets {
    public static List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result=new LinkedList<>();
            result.add(new LinkedList<>());
            for(int x:nums){
                int size=result.size();
                for(int i=0;i<size;i++) {
                    List<Integer> list = new LinkedList<>(result.get(i));
                    list.add(x);
                    result.add(list);
                }

            }
            return result;
    }
    public static List<List<Integer>> subsets2(int[] nums){
         List<List<Integer>> res=new ArrayList<>();
         inOrder(nums,0,new ArrayList<>(),res);
         res.add(new ArrayList<>());
         return res;
    }
    public static void inOrder(int[] nums, int i, ArrayList<Integer> subset, List<List<Integer>> result){
        if(i >= nums.length){
            return;
        }
        subset = new ArrayList<Integer>(subset);
        inOrder(nums,i+1,subset,result);
        subset.add(nums[i]);
        result.add(subset);
        inOrder(nums,i+1,subset,result);
    }
    public static void main(String[] args) {

    }
}
