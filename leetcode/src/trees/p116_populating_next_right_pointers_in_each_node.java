package trees;

public class p116_populating_next_right_pointers_in_each_node {
    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(5);
        Node a6 = new Node(6);
        Node a7 = new Node(7);

        a1.left = a2;
        a1.right = a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        a3.right = a7;

        Node node = connect(a1);
    }

    // 2 ms
//    static Node connect(Node root) {
//        Queue<Node> q = new ArrayDeque<>();
//        q.offer(root);
//
//        while (!q.isEmpty()) {
//            int size = q.size();
//
//            Node prev = null;
//            while (size-- > 0) {
//                Node node = q.poll();
//                if (prev != null) {
//                    prev.next = node;
//                }
//                prev = node;
//
//                if (node.left != null) q.offer(node.left);
//                if (node.right != null) q.offer(node.right);
//            }
//        }
//
//        return root;
//    }

    // 0 ms constant space
    static Node connect(Node root) {
        Node ans = root;
        while (root != null && root.left != null) {
            Node cur = root;
            while (cur != null) {
                cur.left.next = cur.right;
                cur.right.next = cur.next == null ? null : cur.next.left;
                cur = cur.next;
            }
            root = root.left;
        }

        return ans;
    }

    private static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
