package MyStringMethod;

public class MyString {
    private  String A;

    public MyString(String a) {
        this.A = a;
    }

    //    1. equals
    public Object Myequals(String B){
        if(B == null) {
            return null;
        }
      if(this.A == B){
            return true;
      }
        char[] arr=A.toCharArray();
        char[] arr2=B.toCharArray();
        if(arr.length == arr2.length){
            for(int i=0;i<arr.length;i++){
                if(arr[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

   public Object MycompareTo(String B){
        if(B == null){
            return null;
        }
        char[] arr1=A.toCharArray();
        char[] arr2=B.toCharArray();
        int len=0;
        int del=arr1.length-arr2.length;
        if(arr1.length >= arr2.length){
            len=arr2.length;
        } else {
            len=arr1.length;
        }
        for(int i=0;i<len;i++){
            if(arr1[i] != arr2[i] ){
                return arr1[i]-arr2[i];
            }
        }
        return del;
   }
   public char[] MytoCharArray(){
        char[] arr=new char[A.length()];
        for(int i=0;i<this.A.length();i++){
            arr[i]=A.charAt(i);
        }
        return arr;
   }
   public boolean Mycontains(String B){  //
        if(B == null){
            throw new NullPointerException("字符串为空");
        }
        for(int i=0;i<A.length();i++){
            if(A.charAt(i) == B.charAt(0)){
                int count=i;
                for(int k= 0;k<B.length();k++){
                    if(A.charAt(count) != B.charAt(k)){
                        break;
                    }
                }
                return true;
            }
        }
        return  false;
   }
//5. indexOf
//6. lastIndexOf
//7. replaceAll
//8. replaceFirst
//9. split
//10. subString
//11. trim
//12. isEmpty
//13. length

}
