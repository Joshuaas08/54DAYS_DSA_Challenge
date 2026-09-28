class Solution {

    public boolean exist(
            char[][] board,
            String word) {

        int rows = board.length;
        int cols = board[0].length;

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {

                if (dfs(board, word, row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(
            char[][] board,
            String word,
            int row,
            int col,
            int index) {

        // Found the complete word
        if (index == word.length()) {
            return true;
        }

        // Out of bounds
        if (row < 0 ||
            row >= board.length ||
            col < 0 ||
            col >= board[0].length) {

            return false;
        }

        // Wrong character
        if (board[row][col] != word.charAt(index)) {
            return false;
        }

        // Mark as visited
        char temp = board[row][col];
        board[row][col] = '#';

        // Explore four directions
        boolean found =
                dfs(board, word, row + 1, col, index + 1)
                || dfs(board, word, row - 1, col, index + 1)
                || dfs(board, word, row, col + 1, index + 1)
                || dfs(board, word, row, col - 1, index + 1);

        // Undo
        board[row][col] = temp;

        return found;
    }
}
