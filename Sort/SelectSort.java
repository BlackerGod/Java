package Sort;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 8, 7, 6, 9, 5, 2, 10};
//        System.out.println(selectSort(arr).toString());
        selectSort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static int[] selectSort(int[] arr) {
        for (int bound = 1; bound < arr.length; bound++) {
            int tmp = arr[bound];
            int cur = bound - 1;
            for (; cur >= 0; cur--) {
                if (tmp < arr[cur]) {
                    arr[cur + 1] = arr[cur];
                } else {
                    break;
                }
            }
            arr[cur + 1] = tmp;
        }
        return arr;
    }
}
