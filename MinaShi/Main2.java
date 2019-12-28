package MinaShi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        String[] choice=new String[50];
        while (!sc.hasNext("0")){
            int c=0;
            String tmp=sc.next();
            String[] result=tmp.split(" ");
            for(int i=0; i<result.length;i++){
                for(int j=0;j<choice.length;j++){
                    if(result[i].equals(choice[j])){
                        c=1;
                        break;
                    }
                }
                if(c==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
