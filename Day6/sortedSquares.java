package Day6;

import java.util.Arrays;

public class sortedSquares {
    public static int[] sortedSquares(int[] A) {
        if(A == null){
            return A;
        }
        for(int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
