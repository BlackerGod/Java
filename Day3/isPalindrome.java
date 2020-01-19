package Day3;

public class isPalindrome {
    public static boolean isPalindrome(int x) {
        if(x <10 && x >=0){
            return true;
        }
        if(x<0){
            return false;
        }
        int[] a=new int[32];
        int y=x;
        int sum=0;
        for(int i=0;x>0;i++){
            a[i]=x%10;
            x=x/10;
        }
        if(a[0]==0){
            return false;
        }
        for (int j=0;j<=Find(a);j++){
            if(j!=Find(a)) {
                sum = sum * 10 + a[j] * 10;
            }else {
                sum += a[j];
                if(sum ==y){
                    return true;
                }else {
                    return  false;
                }
            }
        }

        return false;
    }
    public static int Find(int[] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
