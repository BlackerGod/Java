class DlinkedNode{
    public int data=0;
    public DlinkedNode pref=null;
    public DlinkedNode next=null;

    public DlinkedNode(int data) {
        this.data = data;
    }
}


public class DLinkedList {
    private DlinkedNode head = new DlinkedNode(-1);

    public DLinkedList() {
        head.next=head;
        head.pref=head;
    }
    public void addFirst(int data){
        DlinkedNode newNode=new DlinkedNode(data);
        DlinkedNode next=head.next;
        head.next=newNode;
        newNode.next=next;

       newNode.pref=head;
       next.pref=newNode;

    }
    public void display(){
        if(head.next == head){
            System.out.println("空链表");
            return;
        }
        System.out.print("正序输出为：[");
        for(DlinkedNode cur=head.next;cur !=head;cur=cur.next){
            System.out.print(cur.data);
            if(cur.next !=head){
                System.out.print(",");
            }
        }
        System.out.println("]");
        System.out.print("逆序输出为：[");
        for(DlinkedNode cur=head.pref;cur !=head;cur=cur.pref){
            System.out.print(cur.data);
            if(cur.pref !=head){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    public void addLast(int data){
        DlinkedNode newNode=new DlinkedNode(data);
        DlinkedNode next=head.pref;

        next.next=newNode;
        newNode.next=head;

        newNode.pref=next;
        head.pref=newNode;

    }
    //任意位置插入,第一个数据节点为0号下标    
    public boolean addIndex(int index,int data){
       int len=size();
       if(index <0 || index >len){
           return false;
       }
       if(index == 0){  //头插入
        addFirst(data);
        return true;
       }
       if(index == len ){  //尾插
           addLast(data);
           return true;
       }
        DlinkedNode cur=head;
       for(int i=0;i<index;i++){
           cur=cur.next;
       }
       DlinkedNode newNode=new DlinkedNode(data);
       newNode.next=cur.next;
       cur.next=newNode;
       newNode.pref=cur;
       newNode.next.pref=newNode;
       return  true;
    }
    public int size(){
        int count=0;   //决定从多少开始
        DlinkedNode cur=head;
        while(cur.next !=head){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //查找是否包含关键字key是否在单链表当中    
    public boolean contains(int key){
        if(head.next==head){
            return false;
        }
        DlinkedNode cur=head.next;
        while(cur !=head){
            if(cur.data == key){
                return  true;
            }else {
                cur=cur.next;
            }
        }
        return  false;
    }
    //删除第一次出现关键字为key的节点    
    public void remove(int key){
        if(head.next==head){
         return;
        }
        DlinkedNode cur=this.head.next;
        while(cur != head){
            if(cur.data == key){
                DlinkedNode prev=cur.pref;
                prev.next=cur.next;
                cur.next.pref=prev;
                return;
            }else{
                cur=cur.next;
            }
        }
        System.out.println("没找到删除元素");
    }
    //删除所有值为key的节点    
    public void removeAllKey(int key){
        if(head.next == head){
            System.out.println("空链表");
            return;
        }
        DlinkedNode cur=head.next;
        while (cur !=head){
            if(cur.data == key){
                DlinkedNode prev=cur.pref;
                prev.next=cur.next;
                cur.next.pref=prev;
                cur=prev.next;
            }else{
                cur=cur.next;
            }
        }
        System.out.println("删除完毕");
    }
    public void clear(){
        this.head.next=head;
        this.head.pref=head;
    }
}