package Day3;

import java.util.HashMap;

public class canConstruct {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.equals("")) {
            return true;
        }
        int hash[] = new int[26];
        for (int i=0;i<magazine.length();i++){
            hash[(int)(magazine.charAt(i) - 'a')] +=1;
        }
        for (int i=0;i<ransomNote.length();i++){
            hash[(int)(ransomNote.charAt(i) - 'a')] -=1;
            if(hash[(int)(ransomNote.charAt(i)- 'a')]<0){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
    }
}
