import jdk.internal.org.objectweb.asm.tree.LdcInsnNode;

class LinkedNode{
    public int data;
    public LinkedNode next = null;

    public LinkedNode(int data) {
        this.data = data;
    }
}
public class LinkedList {  //头插
    private LinkedNode head = null;

    //创建第一个结点
    public void addFirst(int elem) {
        LinkedNode node = new LinkedNode(elem);
        if (head == null) { //空链表
            this.head = node;
            return;
        } else {
            node.next = head;
            this.head = node;
            return;
        }
    }

    //显示链表
    public void display(LinkedNode head) {
        LinkedNode prv;
        if (head == null) {
            System.out.println("空链表！");
            return;
        }
        System.out.print("[");
        for (prv =head; prv != null; prv = prv.next) {
            if (prv.next != null) {
                System.out.print(prv.data + ",");
            } else System.out.print(prv.data);
        }
        System.out.print("]");
    }

    //尾插
    public void addLast(int elem) {
        LinkedNode node = new LinkedNode(elem);
        if (this.head == null) {  //空链表
            this.head = node;
            return;
        }
        LinkedNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意添加结点
    public void addIndex(int index, int elem) {
        LinkedNode node = new LinkedNode(elem);
        int len = size();
        if (index < 0 || index > len) {
            return;
        }
        if (index == 0) {  //头插
            addFirst(elem);
            return;
        }
        if (index == len) {//尾插
            addLast(elem);
            return;
        }
        //中间插入
        LinkedNode cur = this.head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        return;
    }

    public int size() {
        int count = 0;
        LinkedNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    //判断元素是否存在
    public boolean contains(int toFind) {
        // 直接遍历链表, 依次比较每个元素就行了
        if(this.head==null){
            return false;
        }
        LinkedNode cur=this.head;
        for(cur=this.head;cur!=null;cur=cur.next){
            if(cur.data==toFind){
                return true;
            }
        }
        return false;
    }
    //删除指定值
    public void remove(int toRemove) {
        if(this.head==null){  //空链表情况
            System.out.println("空链表!");
            return ;
        }
        //头删除
        if(toRemove==this.head.data){
            this.head=head.next;
            return;
        }
        //别的地方删除，先找前面结点
        LinkedNode prv=getPlace(toRemove);
        prv.next=prv.next.next;
    }
    private LinkedNode getPlace(int toRemove){
        LinkedNode cur=this.head;
        for(;cur!=null;cur=cur.next){
            if(cur.next.data==toRemove){
                return cur;
            }
        }
        return null;
    }
    //删除所有key的值
    public void removeAllKey(int elem){
        if(this.head == null){
            return ;
        }
        LinkedNode prev=head;
        LinkedNode cur=head.next;
        while(cur != null){
            if(elem == cur.data){
                prev.next=cur.next;
                cur=prev.next;
            }
            else{
                prev=prev.next;
                cur=prev.next;
            }
        }
        if (this.head.data ==elem){
            this.head=this.head.next;
        }
    }
    public void reverseOut(){
        if(this.head == null){
            return;
        }
        if(this.head.next == null){
            return;
        }

        LinkedNode prev=null;
        LinkedNode cur=head;
        while(cur !=null){
            LinkedNode next=cur.next;
            if(next == null){
                this.head = cur;
            }
            cur.next=prev;
            prev=cur;
            cur=next;
        }

    }
    public LinkedNode midValue(){
        if(this.head == null){
            return null;
        }
        LinkedNode prev=head;
        LinkedNode cur=head;
        while(prev.next !=null){
            if(prev.next.next == null){
                cur=cur.next;
                return cur;
            }
            prev=prev.next.next;
            cur=cur.next;
        }
        return cur;

    }
    public void clear(){
        this.head=null;
    }
}
