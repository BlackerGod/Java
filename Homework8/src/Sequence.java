public class Sequence {
    private int[] data=new int[10];
    private int num=0;
//展示
    public void display(){
        System.out.print("[");
        for(int i=0;i<this.num;i++){
            if(i !=num-1) {
                System.out.print(data[i]+",");
            }
            else System.out.print(data[i]);
        }
        System.out.print("]");
    }
//添加
    public void add(int place,int aim){
        if(place>this.num && place<0){
            System.out.println("Error");
            return;
        }
        if(this.num>10){
            relloc();
        }
        if(num==place) {
            this.data[place] = aim;
            num++;
        }
        else {
            for (int i = num-1; i >=place; i--) {
                this.data[i+1] = this.data[i];
            }
            this.data[place] = aim;
            num++;
        }
    }
    private void relloc(){
        int[] arr = new int[data.length * 2];
        for(int i = 0; i < data.length; i++){
            arr[i] = data[i];
        }
        this.data = arr;
        }
    ////查找某个元素位置
public int search(int aim){
    for(int i=0;i<this.num;i++){
        if(aim==this.data[i]){
            return i;
        }
    }
    return -1;
}
// 判定是否包含某个元素
    public boolean include(int aim){
        for(int i=0;i<this.num;i++){
            if(aim==this.data[i]){
                return true;
            }
        }
        return false;
    }
    // 获取 pos 位置的元素
    public int src(int pos){
        if(pos>this.num-1){
            System.out.println("place is missing");
            return -1;
        }
        else {
            return this.data[pos];
        }
    }
    // 给 pos 位置的元素设为 value
    public void setValue(int pos,int aim) {
        if (pos > this.num - 1) {
            System.out.println("place is missing");
            return;
        } else {
        this.data[pos]=aim;
        }
    }
    //删除第一次出现的关键字key
    public void del(int aim){
        int place = search(aim);
        if(place == -1){
            System.out.println("元素找不到");
            return;
        }
        for(;place < num - 1; place++){
            data[place] = data[place + 1];
        }
        num--;
        System.out.println("删除成功");
    }
    //获取顺序表长度
    public int getLength(){

        return num;
    }
    //// 清空顺序表
    public void clear(){
        data = new int[10];
        this.num=0;
        System.out.println("清空完毕");
    }

}

