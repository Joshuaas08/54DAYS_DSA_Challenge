class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(board, 0, result);

        return result;
    }

    private void backtrack(
            char[][] board,
            int row,
            List<List<String>> result) {

        if (row == board.length) {
            result.add(createBoard(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (!isSafe(board, row, col)) {
                continue;
            }

            board[row][col] = 'Q';

            backtrack(board, row + 1, result);

            board[row][col] = '.';
        }
    }

    private boolean isSafe(
            char[][] board,
            int row,
            int col) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private List<String> createBoard(char[][] board) {

        List<String> result = new ArrayList<>();

        for (char[] row : board) {
            result.add(new String(row));
        }

        return result;
    }
}
