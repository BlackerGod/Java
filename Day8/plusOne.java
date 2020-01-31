package Day8;

import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int[] digits) {
        if(digits.length == 1 && digits[0] == 9){
            digits=new int[]{1,0};
            return digits;//第一个是9
        }
        if(digits[digits.length-1] == 9){
            int index=digits.length-2;
            digits[index]+=1;
            digits[index+1]=0;

            while (index >0 ){
            if(digits[index] ==10){
                digits[index]=0;
                if(index -1 >= 0) {
                    index--;
                    digits[index]+=1;
                }else {
                    break;
                }
            }else {
                break;
            }
            }
            if(digits[0] == 10){
                digits=new int[digits.length+1];
                digits[0]=1;
            }
            return digits;
        }
        digits[digits.length-1]+=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
}
