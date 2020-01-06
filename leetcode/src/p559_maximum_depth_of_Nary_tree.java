import java.util.List;

public class p559_maximum_depth_of_Nary_tree {
    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(3);
        Node a3 = new Node(2);
        Node a4 = new Node(4);
        Node a5 = new Node(5);
        Node a6 = new Node(6);
        a1.children = List.of(a2, a3, a4);
        a2.children = List.of(a5, a6);

        System.out.println(maxDepth(a1));
    }

    static int maxDepth(Node root) {
        return dfs(root, 1);
    }

    static int dfs(Node node, int depth) {
        if (node == null) return depth;
        int max = depth;
        if (node.children != null) {
            for (Node child : node.children) {
                int dfs = dfs(child, depth + 1);
                max = Math.max(max, dfs);
            }
        }

        return max;
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
