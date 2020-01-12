package StackQueue;

class Node{
    public int val=0;
    Node next=null;

    public Node(int val) {
        this.val = val;
    }
}
public class MyListTrack {
       private Node head=null;
       private Node tail=null;
       private int size =0;
    //入栈
    public void push(int x){
        Node newNode=new Node(x);
        if(head == null){
            head=newNode;
            tail=newNode;
            size++;
            return;
        }
            tail.next=newNode;
            tail=tail.next;
            size++;
            return;
    }
    //出栈
    public Integer pop(){
        if(head == null){
            return  null;
        }
        Integer tmp=tail.val;
        if(head.next == null){
            head=null;
            tail=null;
            size--;
            return tmp;
        }

        Node cur=head;
        while(cur.next != null){
            if(cur.next.next == null){
                cur.next=null;
                tail=cur;
            } else {
                cur = cur.next;
            }
        }
        size--;
        return tmp;

    }
    //取顶
    public Integer peek(){
        if(head == null){
            return  null;
        }
        return tail.val;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return  head==null;
    }


}
