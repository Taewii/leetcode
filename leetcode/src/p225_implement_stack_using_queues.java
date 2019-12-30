import java.util.ArrayDeque;
import java.util.Queue;

public class p225_implement_stack_using_queues {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }

    static class MyStack {

        Queue<Integer> queue = new ArrayDeque<>();

        public MyStack() {

        }

        public void push(int x) {
            queue.offer(x);
            int size = queue.size();

            while (size-- > 1) {
                queue.add(queue.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
