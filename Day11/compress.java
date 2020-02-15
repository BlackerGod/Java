package Day11;

public class compress {

    public static int compress(char[] chars) {
       int size=0;
       int left=0;
       for(int right=0;right<=chars.length;right++){
            if(right == chars.length || chars[right] != chars[left]){
                chars[size++]=chars[left];
                if(right - left >1){
                    for(char x:String.valueOf(right-left).toCharArray()){
                        chars[size++]=x;
                    }
                }
                left=right;
            }
       }
        return size;
    }


    public static void main(String[] args) {
        char[] arr=new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(arr));
    }
}
