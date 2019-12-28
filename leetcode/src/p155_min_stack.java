public class p155_min_stack {
    public static void main(String[] args) {
        MinStack stack = new MinStack();

        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
        System.out.println(stack.getMin());
    }

    static class MinStack {

        private ItemNode head;

        public MinStack() {
        }

        public void push(int x) {
            ItemNode node = new ItemNode(x);
            if (head == null) {
                head = new ItemNode(x);
                return;
            }

            node.min = Math.min(x, head.min);
            node.next = head;
            head = node;
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }

        static class ItemNode {
            int val;
            int min;
            ItemNode next;

            public ItemNode(int val) {
                this.min = val;
                this.val = val;
            }
        }
    }
}
