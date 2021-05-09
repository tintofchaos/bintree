public class Main {
    public static void main(String[] args) {
        Tree tree69 = new Tree();
        BSTNode root = new BSTNode(5);
        tree69.RootNode = root;
        BSTNode right = new BSTNode(7);
        BSTNode left = new BSTNode(6);
        root.right = right;
        root.left = left;
        System.out.println(Tree.Search(root,5).right.key);
    }
}
