public class MergeSort {
    //稳定
    public static void merge(int arr[]){
        mergeSortHelper(arr, 0, arr.length);
    }
    private static void mergeSortHelper(int[] arr,int left,int right){
        if(left >= right || right - left == 1){
            return;
        }
        int mid = (left + right)/2;
        mergeSortHelper(arr,left,mid);
        mergeSortHelper(arr,mid,right);
        merge(arr,left,mid,right);
    }
    private static void merge(int[] arr,int left,int mid,int right){
        int length = right - left;
        int[] output = new int[length];
        int outputIndex = 0;
        int i = left;
        int j = mid;
        while (i < mid && j < right ){
            if(arr[i] <= arr[j]){
                output[outputIndex++] = arr[i++];
            } else {
                output[outputIndex++] = arr[j++];
            }
        }
        while (i < mid){
            output[outputIndex++] = arr[i++];
        }
        while (j < right){
            output[outputIndex++] = arr[j++];
        }
        for(int k=0; k<length;k++){
            arr[left+k] = output[k];
        }
    }
}
