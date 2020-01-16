package Day1;

public class toLowerCase {
    public static String ToLowerCase(String str) {
        if(str == null){
            return null;
        }
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                result += (char)(str.charAt(i)+32);
            }else {
                result +=(char)str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ToLowerCase("ABC"));
    }
}
