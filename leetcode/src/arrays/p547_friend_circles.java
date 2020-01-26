package arrays;

public class p547_friend_circles {
    public static void main(String[] args) {
        System.out.println(findCircleNum(new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 1, 0},
                new int[]{0, 0, 1},
        }));

        System.out.println(findCircleNum(new int[][]{
                new int[]{1, 1, 0},
                new int[]{1, 1, 1},
                new int[]{0, 1, 1},
        }));
    }

    static int findCircleNum(int[][] M) {
        int count = 0;
        boolean[] visited = new boolean[M.length];

        for (int i = 0; i < M.length; i++) {
            if (!visited[i]) {
                dfs(M, visited, i);
                count++;
            }
        }

        return count;
    }

    private static void dfs(int[][] M, boolean[] visited, int i) {
        for (int j = 0; j < M.length; j++) {
            if (M[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(M, visited, j);
            }
        }
    }
}
