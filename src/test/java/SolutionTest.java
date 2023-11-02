import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void averageOfSubtreeTest1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.right = new TreeNode(6);

        int expected = 5;
        int actual = new Solution().averageOfSubtree(root);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void averageOfSubtreeTest2() {
        TreeNode root = new TreeNode(1);
        int expected = 1;
        int actual = new Solution().averageOfSubtree(root);

        Assert.assertEquals(expected, actual);
    }
}
