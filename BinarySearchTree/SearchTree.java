package BinarySearchTree;

public class SearchTree {
    public static class TreeNode{
        public int key;
        public int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private static TreeNode root;
    public static boolean put(int key,int value){
        TreeNode NewNode=new TreeNode(key,value);
        if(root == null){
            root=NewNode;
            return true;
        }
        TreeNode cur=root;
        TreeNode prev=null;
        while(cur !=null){
            if(key>cur.key){
                prev=cur;
                cur=cur.right;
            }else if(key < cur.key){
                prev=cur;
                cur=cur.left;
            }else{
                return  false;
            }
        }
        if(key >prev.key){
            prev.right=NewNode;
        }else {
            prev.left=NewNode;
        }
        return true;
    }
    public static TreeNode Find(int key,int value){
        TreeNode cur=root;
        while(cur != null){
            if(key>cur.key){
                cur=cur.right;
            } else  if(key <cur.key){
                cur=cur.left;
            }else {
                return cur;
            }
        }
        return null;
    }
    public static  void prevOreder(TreeNode root){
        if(root == null){
            return ;
        }
        System.out.println(root.key);
        prevOreder(root.left);
        prevOreder(root.right);
    }
public  static void InOrder(TreeNode root){
        if(root == null){
            return ;
        }
        InOrder(root.left);
        System.out.print(root.key+" ");
        InOrder(root.right);
}
public static boolean remove(int key,int value){
        TreeNode cur=root;
        TreeNode prev=null;
        while(cur!=null){
            if(key>cur.key){
                prev=cur;
                cur=cur.right;
            }else if(key <cur.key){
                prev=cur;
                cur=cur.left;
            }else{
                removeHelp(prev,cur);
                return true;
            }
        }
        return false;
}
public static void removeHelp(TreeNode prev,TreeNode cur){
        if(cur.left == null){
            if(cur==root){
                root=root.right;
            }else if(prev.left==cur){
                prev.left=cur.right;
            }else {
                prev.right=cur.right;
            }
        } else if (cur.right == null){
                if(cur == root){
                    root=root.left;
                }else if(cur==prev.left){
                    prev.left=cur.left;
                }else{
                    prev.right=cur.left;
                }
        }else{
            TreeNode goatParents = cur;
            TreeNode scapegoat = cur.right;
            while(scapegoat.left != null){
                goatParents=scapegoat;
                scapegoat=scapegoat.left;
            }
            cur.key=scapegoat.key;
            cur.value=scapegoat.value;
            if(scapegoat == goatParents.left){
                goatParents.left=scapegoat.left;
            } else {
                goatParents.right=goatParents.right;
            }
        }
}
    public static void main(String[] args) {
        put(9,0);
        put(5,0);
        put(2,0);
        put(7,0);
        put(1,0);
        put(3,0);
        put(4,0);
        put(8,0);
        remove(8,0);
        InOrder(root);
    }
}
