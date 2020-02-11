package Day9;

public class addBinary {
    public static String addBinary(String a, String b) {
        char[] A=a.toCharArray();
        char[] B=b.toCharArray();
        int A_ten = 0;
        int B_ten = 0;
        int j=0;
        for(int i=A.length-1;i>=0;i--){
            A_ten +=pow(A[i],j);
            j++;
        }
        int z=0;
        for(int i=B.length-1;i>=0;i--){
            B_ten +=pow(B[i],z);
            z++;
        }
        int result=A_ten | B_ten;
        String o="";
        for(;result>0;result=result%2){
            o+=result;
        }
        return o;
    }
    public static int pow(int x,int y){
        int result=x;
        y=y-1;
        if(y<0){
            return 1;
        }//2  2
        for(;y>0;y--) {//2*2 4*2
            result *= x;
        }

        return result;
    }
    public static void main(String[] args) {

        System.out.println(addBinary("11","1"));
    }
}
