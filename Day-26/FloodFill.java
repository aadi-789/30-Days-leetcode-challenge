

public class FloodFill {
     public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];

        // Already the required color
        if (originalColor == color) {
            return image;
        }

        dfs(image, sr, sc, originalColor, color);

        return image;
    }

    private void dfs(int[][] image, int row, int col,
                     int originalColor, int newColor) {

        // Boundary check
        if (row < 0 || row >= image.length ||
            col < 0 || col >= image[0].length ||
            image[row][col] != originalColor) {
            return;
        }

        // Change color
        image[row][col] = newColor;

        // Visit four directions
        dfs(image, row + 1, col, originalColor, newColor);
        dfs(image, row - 1, col, originalColor, newColor);
        dfs(image, row, col + 1, originalColor, newColor);
        dfs(image, row, col - 1, originalColor, newColor);
    }
    public static void main(String[] args) {
        FloodFill solution = new FloodFill();
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, color = 2;
        int[][] result = solution.floodFill(image, sr, sc, color);
        
        System.out.println("Flood filled image:");
        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
