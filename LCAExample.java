public class LCAExample {

    // Node class definition
    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    // LCA function using recursion
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null || root == p || root == q)
            return root;

        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;

        if (left != null)
            return left;
        else
            return right;
    }

    // Main method
    public static void main(String[] args) {
        // Building the binary tree
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);

        // Sample nodes to find LCA
        Node p = root.left;              // Node 5
        Node q = root.left.right.right;  // Node 4

        // Find and print LCA
        Node lca = lowestCommonAncestor(root, p, q);
        System.out.println("LCA of " + p.data + " and " + q.data + " is: " + lca.data);
    }
}
