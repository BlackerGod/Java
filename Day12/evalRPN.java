package Day12;

public class evalRPN {
    public static int evalRPN(String[] tokens) {
            int[] result=new int[tokens.length/2+1];
            int index=0;
            for(String s:tokens){
              switch (s){
                  case "+":
                      result[index-2] += result[--index];
                      break;
                  case "-":
                      result[index-2] -= result[--index];
                      break;
                  case "*":
                      result[index-2] *= result[--index];
                      break;
                  case "/":
                      result[index-2] /= result[--index];
                      break;
                  default:
                      result[index++]=Integer.parseInt(s);
              }
            }
            return result[0];
    }

}
