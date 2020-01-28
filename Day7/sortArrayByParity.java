package Day7;

import java.util.Arrays;

public class sortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int start=0;
        int end=A.length-1;
        while(start<end){
            if(A[start]%2 !=0){
                if(A[end] %2 ==0){
                    int a=A[start];
                    A[start]=A[end];
                    A[end]=a;
                    end--;
                    start++;
                }else {
                    end--;
                }
            }else {
                start++;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int arr[]=new int[]{3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
}
