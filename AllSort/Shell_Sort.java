public class Shell_Sort {

    public static void shell_sort(int arr[],int length){

        int incrid = length;
        int tmp = 0;

        while (true){
            incrid = incrid/2;
            for(int k=0;k<incrid;k++){

                for(int i=k+incrid;i<length;i+=incrid){

                    for(int j=i;j>k;j-=incrid) {
                        if (arr[j - incrid] > arr[j]) {
                            tmp = arr[j];
                            arr[j] = arr[j  - incrid];
                            arr[j - incrid] = tmp;
                        } else {
                            break;
                        }
                    }
                }
            }
            if(incrid == 1){
                break;
            }

        }



    }


    public static void shell_sort3(int arr[],int length){
        int pos = length;
        int tem;

        while (true){
            pos = pos/2;
            for(int k=0;k<pos;k++){
               for(int i=k+pos;i<arr.length;i+=pos){
                   for(int j=i;j>k;j-=pos){
                       if(arr[j-pos] > arr[j]){
                        tem = arr[j];
                        arr[j] = arr[j-pos];
                        arr[j-pos] = tem;
                       } else {
                           break;
                       }
                   }
               }
            }
            if(pos == 1){
                break;
            }
        }



    }
    public static void shell_sort2(int arr[]){
        int pos = arr.length;
        while (pos > 1){
            insert_sort(arr,pos);
            pos = pos/2;
        }
        insert_sort(arr,1);
    }

    public static void insert_sort(int[] arr, int pos){
        for(int i=pos;i<arr.length;i++){
            int tem = arr[i];
            int j=i-pos;
            for(;j>=0;j-=pos){
                if(arr[j] > tem ){
                   arr[j+pos] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+pos] = tem;
        }

    }
}
