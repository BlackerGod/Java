package Day6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseOnlyLetters {
    public static String reverseOnlyLetters(String S) {
        char[] arr=S.toCharArray();
        int start=0;
        int end=S.length()-1;
        while(start < end){
            if('A' <= arr[start] && arr[start] <='Z' || arr[start] >='a' && arr[start] <= 'z'){
                if('A' <= arr[end] && arr[end] <='Z' || arr[end] >='a' && arr[end] <= 'z'){
                 char c=arr[start];
                 arr[start]=arr[end];
                 arr[end]=c;
                 end--;
                 start++;
                }else {
                    end--;
                }
            }else {
                start++;
            }
        }
        String result="";
        for(int x:arr){
            result += (char)x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("7_28]"
        ));
    }
}
