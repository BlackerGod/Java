package Experiment;

public class PriorityQ {
    public static process[] queArray;
    int size=0;


    public void insert(process pro){
        int j=0;
        if(size == 0){
            queArray[size]=pro;
            size++;
        }else{
            for(j=size-1;j>=0;j--){
                if(pro.priority<queArray[j].priority){
                    queArray[j+1]=queArray[j];
                }else {
                    break;
                }
            }
        }
        queArray[j+1]=pro;
        size++;
    }

}
