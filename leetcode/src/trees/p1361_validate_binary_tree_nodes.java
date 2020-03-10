package trees;

import java.util.HashSet;
import java.util.Set;

public class p1361_validate_binary_tree_nodes {
    public static void main(String[] args) {
        System.out.println(validateBinaryTreeNodes(4, new int[]{1, -1, 3, -1}, new int[]{2, -1, -1, -1}));
        System.out.println(validateBinaryTreeNodes(4, new int[]{1, -1, 3, -1}, new int[]{2, 3, -1, -1}));
        System.out.println(validateBinaryTreeNodes(2, new int[]{1, 0}, new int[]{-1, -1}));
        System.out.println(validateBinaryTreeNodes(6, new int[]{1, -1, -1, 4, -1, -1}, new int[]{2, -1, -1, 5, -1, -1}));
    }

    static boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                if (set.contains(leftChild[i])) return false;
                set.add(leftChild[i]);
            }

            if (rightChild[i] != -1) {
                if (set.contains(rightChild[i])) return false;
                set.add(rightChild[i]);
            }
        }

        return set.size() == n - 1;
    }
}
