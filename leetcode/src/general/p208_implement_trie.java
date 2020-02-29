package general;

public class p208_implement_trie {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }

    static class Trie {
        private TrieNode head;

        public Trie() {
            this.head = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node = head;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (node.children[ch - 'a'] == null) {
                    node.children[ch - 'a'] = new TrieNode();
                }
                node = node.children[ch - 'a'];
            }

            node.isWord = true;
        }

        public boolean search(String word) {
            TrieNode node = head;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (node.children[ch - 'a'] == null) return false;
                node = node.children[ch - 'a'];
            }

            return node.isWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode node = head;
            for (int i = 0; i < prefix.length(); i++) {
                char ch = prefix.charAt(i);
                if (node.children[ch - 'a'] == null) return false;
                node = node.children[ch - 'a'];
            }

            return true;
        }

        private static class TrieNode {
            private boolean isWord;
            private TrieNode[] children = new TrieNode[26];
        }
    }
}
