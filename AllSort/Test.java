import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[] =new int[]{9,5,2,7,8,1,3,4,6,0};
        //BubbleSort.bubblesort(arr);
        //BubbleSort.bubblesort2(arr); 冒泡排序

       // SelectSort.SelectSort(arr); 选择排序

        //InsertSort.insertsort(arr);插入排序

       //Shell_Sort.shell_sort3(arr,4);//希尔排序
       HeapSort.heapSort(arr);
        //QuickSort2.quickSort(arr);
        //MergeSort.merge(arr);
        System.out.println(Arrays.toString(arr));
    }
}
