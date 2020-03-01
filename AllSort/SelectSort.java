public class SelectSort {

    public static void SelectSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int tmp = arr[i];
                arr[i] =arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }
}
