class Solution {
    public int averageOfSubtree(TreeNode root) {
        TreeNode rootS = new TreeNode();
        TreeNode rootC = new TreeNode();
        buildS(root, rootS);
        buildC(root, rootC);
        int res[] = {0};
        count(rootS, rootC, root, res);
        return res[0];
    }

    void count(TreeNode rootS, TreeNode rootC, TreeNode root, int[] res) {
        if (root.val == rootS.val / rootC.val) res[0]++;
        if (rootC.left != null) {
            count(rootS.left, rootC.left, root.left, res);
        }
        if (rootC.right != null) {
            count(rootS.right, rootC.right, root.right, res);
        }
    }

    int buildC(TreeNode root, TreeNode rootC) {
        int val = 1;

        if (root.left != null) {
            rootC.left = new TreeNode();
            val += buildC(root.left, rootC.left);
        }
        if (root.right != null) {
            rootC.right = new TreeNode();
            val += buildC(root.right, rootC.right);
        }

        rootC.val = val;
        return val;
    }


    int buildS(TreeNode root, TreeNode rootS) {
        int val = root.val;

        if (root.left != null) {
            rootS.left = new TreeNode();
            val += buildS(root.left, rootS.left);
        }
        if (root.right != null) {
            rootS.right = new TreeNode();
            val += buildS(root.right, rootS.right);
        }

        rootS.val = val;
        return val;
    }

}