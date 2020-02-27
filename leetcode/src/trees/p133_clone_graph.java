package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p133_clone_graph {
    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);

        a1.neighbors = List.of(a2, a4);
        a2.neighbors = List.of(a1, a3);
        a3.neighbors = List.of(a2, a4);
        a4.neighbors = List.of(a1, a3);

        Node node = cloneGraph(a1);
    }

    static Node cloneGraph(Node node) {
        if (node == null) return null;
        Map<Integer, Node> map = new HashMap<>();
        return helper(node, map);
    }

    private static Node helper(Node node, Map<Integer, Node> map) {
        if (map.containsKey(node.val)) return map.get(node.val);

        Node newNode = new Node(node.val);
        map.put(node.val, newNode);

        for (Node child : node.neighbors) {
            newNode.neighbors.add(helper(child, map));
        }

        return newNode;
    }

    private static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
