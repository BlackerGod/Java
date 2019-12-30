package Poke;

class MyHashSet {
    public int key;
    public MyHashSet next;

    /** Initialize your data structure here. */
    public MyHashSet(int key) {
        this.key = key;
    }
}
public class Main{
    public static MyHashSet[] Hash=new MyHashSet[101];

    public static void add(int key) {
        int index=key%Hash.length;
        MyHashSet head=Hash[index];
        MyHashSet newNode=new MyHashSet(key);
        if(Hash[index] == null){
            Hash[index]=newNode;
            return;
        }
        for(MyHashSet cur=head;cur!=null;cur=cur.next){
            if(cur.key== key){
                return ;
            }
        }
        newNode.next=Hash[index].next;
        Hash[index]=newNode;
    }

    public static void remove(int key) {
        int index=key%Hash.length;
        MyHashSet cur=Hash[index];
        while(cur != null && cur.next !=null){
            if(cur.next.key==key){
                cur.next=cur.next.next;
                return;
            }
        }
    }

    /** Returns true if this set contains the specified element */
    public static boolean contains(int key) {
        int index=key%Hash.length;
        MyHashSet cur=Hash[index];
        for(;cur!=null;cur=cur.next){
            if(cur.key==key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        add(1);
    }
}

