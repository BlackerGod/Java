import java.util.Stack;

public class QuickSort2 {

    //稳定
        public static void quickSort(int[] array) {
            Stack<Integer> stack = new Stack<>();
            stack.push(array.length - 1);
            stack.push(0);
            while (!stack.isEmpty()) {
                int left = stack.pop();
                int right = stack.pop();
                if (left >= right) {
                    continue;
                }
                int pivotIndex = partition(array, left, right);
                stack.push(right);
                stack.push(pivotIndex + 1);
                stack.push(pivotIndex - 1);
                stack.push(left);
            }
        }

    private static int partition(int[] arr,int left,int right){
        int BaseIndex = right;
        int BaseValue = arr[BaseIndex];
        while (left < BaseIndex){
            while (left < BaseIndex && arr[left] <= BaseValue){
                left++;
            }
            while (left < BaseIndex && BaseValue <= arr[BaseIndex]){
                BaseIndex--;
            }
            swap(arr,left,BaseIndex);
        }
        swap(arr,left,right);
        return left;
    }
    public static void swap(int[] arr,int x,int y){
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
