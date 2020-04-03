package Day14;

import javax.sound.midi.Track;
import java.util.*;

class TreeNode {
    int val;
   TreeNode left=null;
   TreeNode right=null;
   TreeNode(int x) { val = x; }
 }
public class isMatch {
    public static TreeNode root=null;
    public static void CreatTree(){
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        TreeNode node4=new TreeNode(4);
        TreeNode node5=new TreeNode(5);
        root=node1;
        root.left=node2;
        root.right=node3;
        node2.right=node5;
        node3.right=node4;
    }
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
               int tmp=0;
               int size=queue.size();
            for(int i=0;i<size;i++) {
                TreeNode newNode = queue.poll();
                if (newNode.left != null) {
                    queue.offer(newNode.left);
                }
                if (newNode.right != null) {
                    queue.offer(newNode.right);
                }
                tmp=newNode.val;
            }
            result.add(tmp);
        }
        return result;
    }

    public static void main(String[] args) {
        CreatTree();
        rightSideView(root);

    }
}


