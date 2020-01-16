package general;

import java.util.Iterator;
import java.util.List;

public class p284_peeking_iterator {
    public static void main(String[] args) {
        PeekingIterator iterator = new PeekingIterator(List.of(1, 2, 3).iterator());
        System.out.println(iterator.next());
        System.out.println(iterator.peek());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
    }

    static class PeekingIterator implements Iterator<Integer> {

        private final Iterator<Integer> iterator;
        private Integer peeked = null;

        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = iterator;
        }

        public Integer peek() {
            if (!hasNext()) return null;
            if (peeked == null) peeked = iterator.next();
            return peeked;
        }

        @Override
        public Integer next() {
            Integer next;
            if (peeked != null) {
                next = peeked;
                peeked = null;
                peek();
            } else {
                next = iterator.next();
            }

            return next;
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext() || peeked != null;
        }
    }
}
