package trees.linked_lists;

public class p430_flatten_a_multilevel_doubly_linked_list {
    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(5);
        Node a6 = new Node(6);
        Node a7 = new Node(7);
        Node a8 = new Node(8);
        Node a9 = new Node(9);
        Node a10 = new Node(10);
        Node a11 = new Node(11);
        Node a12 = new Node(12);

        a1.next = a2;
        a2.prev = a1;
        a2.next = a3;
        a3.prev = a2;
        a3.next = a4;
        a3.child = a7;
        a4.prev = a3;
        a4.next = a5;
        a5.prev = a4;
        a5.next = a6;
        a6.prev = a5;
        a7.next = a8;
        a8.prev = a7;
        a8.next = a9;
        a9.prev = a8;
        a9.next = a10;
        a10.prev = a9;
        a8.child = a11;
        a11.next = a12;
        a12.prev = a11;

        Node rs = flatten(a1);
    }

    static Node flatten(Node head) {
        if (head == null) return null;
        Node node = head;

        while (node != null) {
            if (node.child == null) {
                node = node.next;
                continue;
            }

            Node child = node.child;
            while (child.next != null) {
                child = child.next;
            }

            child.next = node.next;
            if (node.next != null) node.next.prev = child;
            node.next = node.child;
            node.child.prev = node;
            node.child = null;
        }

        return head;
    }

    private static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }
}
