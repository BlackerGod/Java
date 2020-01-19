package Day3;

public class findReapleString {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.equals("")){
            return true;
        }
        int slow=0;
        while(slow<magazine.length()){
            if(ransomNote.charAt(0) == magazine.charAt(slow)){
                int fast = slow;
                int index=0;
                boolean choose=false;
                while (index<ransomNote.length()) {
                    if(ransomNote.charAt(index) != magazine.charAt(fast)){
                        choose=false;
                        break;
                    }else {
                        choose=true;
                        fast++;
                        index++;
                    }
                }
                if(choose){
                    return choose;
                }else {
                    slow++;
                }
            }else {
                slow++;
            }
        }

        return false;
    }
}
