import java.util.*;

public class WallsandGates {
    public void wallsAndGates(int[][] rooms) {

        int rows = rooms.length;
        int cols = rooms[0].length;

        Queue<int[]> queue = new LinkedList<>();

        // Add all gates
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (rooms[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                }
            }
        }

        int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            for (int[] dir : directions) {

                int nr = current[0] + dir[0];
                int nc = current[1] + dir[1];

                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    rooms[nr][nc] == Integer.MAX_VALUE) {

                    rooms[nr][nc] = rooms[current[0]][current[1]] + 1;

                    queue.offer(new int[]{nr, nc});
                }
            }
        }
    }
    public static void main(String[] args) {
        WallsandGates wg = new WallsandGates();
        int[][] rooms = {
            {Integer.MAX_VALUE, -1, 0, Integer.MAX_VALUE},
            {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, -1},
            {Integer.MAX_VALUE, -1, Integer.MAX_VALUE, -1},
            {0, -1, Integer.MAX_VALUE, Integer.MAX_VALUE}
        };

        wg.wallsAndGates(rooms);

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                System.out.print(rooms[i][j] + " ");
            }
            System.out.println();
        }
    }
}
