public class Tree {
    BSTNode RootNode;
    public static BSTNode Search(BSTNode root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key < key)
            return Search(root.right, key);
        return Search(root.left, key);
    }
}