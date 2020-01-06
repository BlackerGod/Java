package StackQueue;

public class MyArrayTrack {
    public int[] data=new int[100];
    public int size=0;

    //入栈
    public boolean push(int x){
        if(size == data.length){
            return false;
        }
        size++;
        data[size-1]=x;
        return true;
    }
    //出栈
    public Integer pop(){
        if(this.size == 0){
            return null;
        }
        int tmp=data[size-1];
        size--;
        return tmp;
    }
    //取顶
    public Integer peek(){
        if(this.size == 0){
            return  null;
        }
        return data[size-1];
    }
    public int size(){
        return this.size;
    }
    public boolean Isempty(){
        return size == 0;
    }


}
