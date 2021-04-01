package binary.search.tree;

public class Tree {

    private TreeNode root;

    public void insert(int data) {
        if (root == null)
            root = new TreeNode(data);
        root.insert(data);
    }

    public void traverseInOrder() {
        if (root != null)
            root.traverseInOrder();
    }

    public TreeNode get(int value) {
        if (root != null)
            return root.get(value);
        else
            return null;
    }

    public int min() {
        if (root != null)
            return root.min();
        else
            return Integer.MIN_VALUE;
    }

    public int max() {
        if (root != null)
            return root.max();
        else
            return Integer.MAX_VALUE;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if (subTreeRoot == null)
            return null;
        if (value < subTreeRoot.getData())
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        else if (value > subTreeRoot.getData())
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        else {

            //Node to be deleted has 0 or 1 children
            if (subTreeRoot.getLeftChild() == null)
                return subTreeRoot.getRightChild();
            else if (subTreeRoot.getRightChild() == null)
                return subTreeRoot.getLeftChild();

            //Node to be deleted has 2 children
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }
        return subTreeRoot;
    }
}
