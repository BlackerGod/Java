public class MyHashMap {
    public static class HashNode{
        public int key;
        public int value;
        HashNode next;

        public HashNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    public static final double paration=0.75;
    public static HashNode[] Hash=new HashNode[101];
    public static int size=0;
    public static  void add(int key,int value){
        int index=key%Hash.length;
        HashNode head=Hash[index];
        HashNode newNode=new HashNode(key,value);
        if(head == null){
            head=newNode;
            size++;
            return;
        }
        for(HashNode cur=head;cur!=null;cur=cur.next){
            if(cur.key== key){
                cur.value=value;
                size++;
                return;
            }
        }
            newNode.next=head.next;
            head=newNode;
            size++;
    }
    public static HashNode Find(int key,int value){
        int index=key%Hash.length;
        HashNode cur=Hash[index];
        for(;cur!=null;cur=cur.next){
            if(cur.key==key){
                return cur;
            }
        }
        return null;
    }
    public  static boolean remove(int key,int value){
        int index=key%Hash.length;
        HashNode cur=Hash[index];
        while(cur != null && cur.next !=null){
            if(cur.next.key==key){
                cur.next=cur.next.next;
                return true;
            }
        }
        return false;
    }
}
