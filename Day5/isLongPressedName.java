package Day5;

public class isLongPressedName {
    public static boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length()){
            return false;
        }
        int slow=0;
        int fast=0;
        while(slow <name.length() && fast<typed.length()){
            if(name.charAt(slow) == typed.charAt(fast)){
                slow++;
                fast++;
            }else if(slow !=0 && typed.charAt(fast) == name.charAt(slow-1)){
                fast++;
            }else {
                return false;
            }
        }
        if(slow != name.length()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println( isLongPressedName("alex","aaleex"));;
    }
}
