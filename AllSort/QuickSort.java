public class QuickSort {

    public static void quicksort(int[] arr){
        quickSortInternal(arr,0,arr.length-1);
    }

    private static void quickSortInternal(int[] arr,int left, int right){
        if(left >= right){
            return;
        }
        int pivotIndex = partition(arr, left, right);
        quickSortInternal(arr,left,pivotIndex-1);
        quickSortInternal(arr,pivotIndex+1,right);
    }

    private static int partition(int[] arr,int left,int right){
        int baseIndex = right;
        int baseValue = arr[baseIndex];
        while (left < baseIndex){
            while (left < baseIndex && arr[left] <= baseValue){
                left++;
            }
            while (left < baseIndex && baseValue <= arr[baseIndex] ){
                baseIndex--;
            }
            swap(arr,left,baseIndex);
        }
        swap(arr,right,left);
        return left;
    }
   private static void swap(int[] arr,int left, int right){
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
