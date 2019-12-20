public class Homework7 {
    public static void main(String[] args) {
//        System.out.println(new Calculator(1,3).add());
//        System.out.println(Test.sequence);
        int a=1;
        int b=2;
        System.out.println("A="+a+"   "+"B="+b);
        int[] swap=new int[2];
        swap=change(a,b);
        a=swap[0];
        b=swap[1];
        System.out.println("交换后A="+a+"   "+"B="+b);
    }
    public static int[] change(int a,int b){
        int[] arr=new int[2];
        arr[0]=b;
        arr[1]=a;
        return arr;
    }
}
