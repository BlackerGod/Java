package Day4;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        if(s == null){
            return 0;
        }
        String[] result=s.split(" ");
        if(result.length ==0){
            return 0;
        }
        return result[result.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hello world"));
    }
}
