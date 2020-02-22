public class BubbleSort {
    //稳定
    public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j] < arr[j-1]){
                    int tmp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }
    }

    public static void bubblesort2(int[] arr){
        int temp;
        boolean flag;
        for(int i=0;i<arr.length-1;i++){
            flag =false;
            for(int j=arr.length-1;j>i;j--){
                if(arr[j] < arr[j-1]){
                     temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }

        }
    }
}
