class Mynode{
    public int val;
    public Mynode next=null;

    public Mynode(int elem){
        this.val=elem;
    }
}
public class MyLinkedList {
    public MyLinkedList() {
    }
    public void display(){
        Mynode cur=this.head;
        while(cur !=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    Mynode head=null;
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        int len=size();
        if(this.head == null || index <0 || index > len || len<0){
            return -1;
        }
        Mynode cur=this.head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.val;
    }
    private int size(){
        if(this.head==null){
            return -1;
        }
        int count=0;
        Mynode cur=this.head;
        while(cur.next != null){
            cur=cur.next;
            count++;
        }
        return count;
    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Mynode node=new Mynode(val);
        if(this.head ==null){
            this.head=node;
            return;
        }
        else{
            node.next=head;
            this.head=node;
            return;
        }
    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Mynode node=new Mynode(val);
        if(this.head == null){
            this.head=node;
            return;
        }
        else{
            Mynode cur=this.head;
            while(cur.next !=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        int len=size();
        //System.out.println(len);
        if(index >len){
            return;
        }
        if(index < 0){
            addAtHead(val);
            return;
        }
        if(index == len+1){
            addAtTail(val);
            return;
        }
        Mynode cur=this.head;
        Mynode node=new Mynode(val);
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        node.next=cur.next;
        cur.next=node;
    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(this.head == null){
            return;
        }
        int len=size();
        if(index <0 ||index > len){
            return;
        }
        if(index == 0){
            this.head=this.head.next;
            return;
        }
        Mynode cur=this.head;
        for(int i=0;i<index-1;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
    }
}

