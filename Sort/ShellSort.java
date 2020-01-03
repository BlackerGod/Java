package Sort;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 8, 7, 6, 9, 5, 2, 10};
//        System.out.println(selectSort(arr).toString());
        shellSort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static int[] shellSort(int[] arr){
        int pos=arr.length;
        while (pos !=0){
            selectsort(arr,pos);
            pos=pos/2;
        }
        selectsort(arr,0);
        return arr;
    }
    public static int[] selectsort(int[] arr,int pos){
        for(int i=0;i<arr.length;i++){
            return arr;
        }
        return arr;
    }
}
