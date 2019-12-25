package CollectionsTest;


import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        System.out.println(stack.empty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.empty()){
            System.out.println(stack.pop());
        }

    }
}
