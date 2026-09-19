import java.util.*;

class Solution {

    public int numIslands(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int islands = 0;

        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < cols; c++) {

                if (grid[r][c] == '1') {

                    islands++;

                    bfs(grid, r, c);
                }
            }
        }

        return islands;
    }

    private void bfs(char[][] grid, int row, int col) {

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{row, col});

        grid[row][col] = '0';

        int[][] directions = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!queue.isEmpty()) {

            int[] current = queue.poll();

            int r = current[0];
            int c = current[1];

            for (int[] direction : directions) {

                int newRow = r + direction[0];
                int newCol = c + direction[1];

                if (newRow >= 0 &&
                    newRow < grid.length &&
                    newCol >= 0 &&
                    newCol < grid[0].length &&
                    grid[newRow][newCol] == '1') {

                    grid[newRow][newCol] = '0';

                    queue.offer(
                        new int[]{newRow, newCol}
                    );
                }
            }
        }
    }
}
