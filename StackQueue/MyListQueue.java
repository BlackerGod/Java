package StackQueue;
class QueueNode{
    public int val=0;
    QueueNode next=null;

    public QueueNode(int val) {
        this.val = val;
    }
}
public class MyListQueue {
    private QueueNode head =null;
    private QueueNode tail =null;
    public int size=0;
    //入队
    public void offer(int x){
        QueueNode newNode=new QueueNode(x);
        if(head == null){
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        tail=tail.next;
        size++;
    }
    //出队
    public Integer poll(){
        if(head == null){
            return null;
        }
        int tmp=head.val;
        head=head.next;
        if(head == null){
            tail=null;
        }
        size--;
        return  tmp;
    }
    //队首
    public Integer peek(){
        if(head == null ){
            return null;
        }
        return head.val;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public static void main(String[] args) {
        MyListQueue myQueue = new MyListQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        while (!myQueue.isEmpty()) {
            int curFront = myQueue.peek();
            System.out.println(curFront);
            myQueue.poll();
        }
    }
}
