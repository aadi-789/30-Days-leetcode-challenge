import java.util.*;

class RottingOranges {
    public int orangesRotting(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // Add all rotten oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;

        int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] current = queue.poll();

                for (int[] dir : directions) {

                    int nr = current[0] + dir[0];
                    int nc = current[1] + dir[1];

                    if (nr >= 0 && nr < rows &&
                        nc >= 0 && nc < cols &&
                        grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        fresh--;

                        queue.offer(new int[]{nr, nc});
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
    public static void main(String[] args) {
        RottingOranges solution = new RottingOranges();

        int[][] grid1 = {
            {2, 1, 1},
            {1, 1, 0},
            {0, 1, 1}
        };
        System.out.println(solution.orangesRotting(grid1)); // Output: 4

        int[][] grid2 = {
            {2, 1, 1},
            {0, 1, 1},
            {1, 0, 1}
        };
        System.out.println(solution.orangesRotting(grid2)); // Output: -1

        int[][] grid3 = {
            {0, 2}
        };
        System.out.println(solution.orangesRotting(grid3)); // Output: 0
    }
}