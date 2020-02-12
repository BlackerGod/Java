package Day9;

public class addBinary2 {
    public static String addBinary2(String a, String b) {
        int pend=0;
        StringBuffer result=new StringBuffer();
        for(int i=a.length()-1,j=b.length()-1;i>=0||j>=0;i--,j--){
            int sum=pend;
            sum += (i >=0 ? a.charAt(i)-'0':0);
            sum += (j >=0 ? b.charAt(j)-'0':0);
            result.append(sum%2);
            pend=sum/2;
        }
        result.append(pend == 1?pend: "");
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary2("11","1"));;
    }
}





