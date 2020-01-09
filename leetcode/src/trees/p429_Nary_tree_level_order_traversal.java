package trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class p429_Nary_tree_level_order_traversal {
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
        a6.children = List.of(a7);
        a7.children = List.of(a8);

        List<List<Integer>> lists = levelOrder(a1);
    }

    static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<Node> stack = new ArrayDeque<>();
        stack.offer(root);

        int total = 1;
        int current = 1;
        List<Integer> list = new ArrayList<>();

        while (!stack.isEmpty()) {
            Node node = stack.poll();
            list.add(node.val);
            current--;
            total--;

            if (node.children != null) {
                total += node.children.size();
                for (Node child : node.children) {
                    stack.offer(child);
                }
            }

            if (current == 0) {
                current = total;
                ans.add(list);
                list = new ArrayList<>();
            }
        }

        return ans;
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
