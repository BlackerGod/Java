package MinaShi;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Main{ //斐波那契数的最少步数;s
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice <=0 || choice>1000000){
            return;
        }
        System.out.println(getStep(choice));

    }
    public static  int getStep(int n){
        int num=0;
        int x=0;
        while(num>=0){
            if(Fibon(num)>=n){
                x=Fibon(num);
                break;
            }else {
                num++;
            }
        }
        int y=Fibon(num-1);
        return min(abs(y-n),abs(x-n));
    }
    public static int Fibon(int n){
        if(n==0){
            return  0;
        } else {
            if(n==1){
                return 1;
            }else {
                return Fibon(n-1)+Fibon(n-2);
            }
        }
    }
    public static int min(int a,int b){
        if(a<b){
            return a;
        } else {
            return b;
        }
    }
}
