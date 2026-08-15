package Microsoft;

public class CountGoodNodesinBT {
    public int goodNodes(TreeNode root) {
        if (root==null){
            return 0;
        }
        return helper(root,root.val);
    }
    public int helper(TreeNode root,int data){
        if(root==null){
            return 0;
        }
        int cnt=0;
        if(data<=root.val){
            cnt++;
        }
        int newmxm=Math.max(data, root.val);
        int l=helper(root.left, newmxm);
        int r=helper(root.right, newmxm);
        return l+r+cnt;
    }
    public static void main(String[] args) {
        
    }
}
