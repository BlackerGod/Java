package Day10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myAtoi {

    public static int myAtoi(String str) {
        if(str == null || str.equals("")){
            return 0;
        }
        StringBuffer result=new StringBuffer();
        int index=0;
        while (index <str.length()){
            if(str.charAt(index) == ' '){
                index++;
                continue;
            } else if (str.charAt(index) == '+'||str.charAt(index) == '-' || (str.charAt(index) >='0' && str.charAt(index) <= '9') ){
                result.append(str.charAt(index));
                index++;
                break;
            }else {
                return 0;
            }
        }
        if(index == str.length()){
           if(str.charAt(0) >='0' && str.charAt(0) <= '9'){
               return Integer.parseInt(result.toString());
           }else {
               return 0;
           }
        }
        for(;index<str.length();index++){
            if(str.charAt(index) >='0' && str.charAt(index) <= '9'){
                result.append(str.charAt(index));
            }else {
                break;
            }
        }
        int a;
        try {
              a = Integer.parseInt(result.toString());
        } catch (Exception e){
            if(result.toString().length()==1){
                return 0;
            }
            if(result.charAt(0) == '-') {
                return Integer.MIN_VALUE;
            }else {
                return  Integer.MAX_VALUE;
            }
        }
        return  a;
    }

    public static int myAtoi2(String str) {
        str=str.trim();//删除字符串前面的空格
        Pattern p = Pattern.compile("^[\\+\\-]?\\d+");
        Matcher m = p.matcher(str);
        int value = 0;
        if (m.find()){//字符串转整数，溢出
            try {
                value = Integer.parseInt(str.substring(m.start(), m.end()));
            } catch (Exception e){
                value = str.charAt(0) == '-' ? Integer.MIN_VALUE: Integer.MAX_VALUE;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        System.out.println(myAtoi("+-2"));
    }
}
