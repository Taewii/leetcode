import java.util.ArrayList;
import java.util.List;

public class p590_Nary_tree_postorder_traversal {
    static List<Integer> ans = new ArrayList<>();

    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(2);
        Node a4 = new Node(4);
        Node a5 = new Node(5);
        Node a6 = new Node(6);
        Node a7 = new Node(8);
        Node a8 = new Node(11);
        a1.children = List.of(a2, a3, a4);
        a2.children = List.of(a5, a6);
//        a6.children = List.of(a7);
//        a7.children = List.of(a8);

        System.out.println(postorder(a1));
    }

    static List<Integer> postorder(Node root) {
        postorderTraversal(root);
        return ans;
    }

    static void postorderTraversal(Node node) {
        if (node == null) return;
        if (node.children != null) {
            for (Node child : node.children) {
                postorderTraversal(child);
            }
        }
        ans.add(node.val);
    }

    private static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
