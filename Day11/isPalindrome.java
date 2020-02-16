package Day11;

public class isPalindrome {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 1) {
            return true;
        }
        s=s.toLowerCase();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                result.append(s.charAt(i));
            }
        }
        String tmp=result.toString();
        if(tmp.equals(result.reverse().toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
