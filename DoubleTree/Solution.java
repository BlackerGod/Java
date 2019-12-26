package DoubleTree;

import java.util.*;


public class Solution {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root == null){
            return result;
        }

        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root == null){
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root == null){
            return result;
        }
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null){
            return true;
        }
        if(s== null || t== null){
            return false;
        }
        boolean ret=false;
        if(s.val == t.val){
            ret= isSameTree(s,t);
        }
        if(!ret){
            return isSubtree(s.left,t);
        }
        if(!ret){
            return isSubtree(s.right,t);
        }
        return ret;
    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+(left>right?left:right);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left==null && root.right== null){
            return true;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        if(left-right>1 || right -left>1 ){
            return false;
        }
        return isBalanced(root.left) &&isBalanced(root.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public static boolean isMirror(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return  false;
        }
        if(left.val != right.val){
            return false;
        }
        return isMirror(left.left,right.right) &&isMirror(left.right,right.left);
    }
    private List<List<Integer>> result=new ArrayList<>();
        public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return null;
        }
        help(root,0);
        return result;
        }
        public void help(TreeNode root,int leave){
            if(leave == result.size()){
                result.add(new ArrayList<>());
            }
            result.get(leave).add(root.val);
            if(root.left != null){
                help(root.left,leave+1);
            }
            if(root.right != null){
                help(root.right,leave+1);
            }
        }
        private TreeNode cla=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return cla;
        }
        FindNode(root,p,q);
        return  cla;
    }
    public boolean FindNode(TreeNode root,TreeNode p,TreeNode q){
        if(root == null){
            return false;
        }
        int left=FindNode(root.left,p,q)?1:0;
        int right=FindNode(root.right,p,q)?1:0;
        int mid=(p == root || q== root)?1:0;
        if(left + right +mid >=2){
            cla=root;
        }
        return (left+right+mid)>0;
    }
    public List<Integer> preTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        if(root == null){
            return null;
        }

        Stack<TreeNode> stack=new Stack<>();

        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode tmp=stack.pop();
            result.add(tmp.val);
           if(tmp.right!=null){
               stack.push(tmp.right);
           }
           if(tmp.left !=null){
               stack.push(tmp.left);
           }
        }
        return result;
    }
    public List<Integer> inTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while(true){
                while(cur!=null){
                    stack.push(cur);
                    cur=cur.left;
                }
                if(stack.isEmpty()){
                    break;
                }
                TreeNode tmp=stack.pop();
                result.add(tmp.val);
                cur=tmp.right;
        }
        return result;
    }
    public List<Integer> postTraversal(TreeNode root) {
        List<Integer> result=new LinkedList<>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        TreeNode prev=null;
        while(true){
            while(cur!=null){
                stack.push(cur.left);
                cur=cur.left;
            }
            if(stack.isEmpty()){
                break;
            }
            TreeNode top=stack.peek();

            if(top.right == null ||prev == top.right){
                result.add(stack.pop().val);
                prev=top;
            } else{
                cur=top.right;
            }
        }
        return  result;
    }
}

