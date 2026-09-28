class Solution {

    public void solveSudoku(char[][] board) {

        solve(board);
    }

    private boolean solve(char[][] board) {

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                // Skip filled cells
                if (board[row][col] != '.') {
                    continue;
                }

                // Try digits 1-9
                for (char digit = '1';
                     digit <= '9';
                     digit++) {

                    if (!isValid(board, row, col, digit)) {
                        continue;
                    }

                    // Choose
                    board[row][col] = digit;

                    // Explore
                    if (solve(board)) {
                        return true;
                    }

                    // Undo
                    board[row][col] = '.';
                }

                // No valid digit works
                return false;
            }
        }

        // Board solved
        return true;
    }

    private boolean isValid(
            char[][] board,
            int row,
            int col,
            char digit) {

        // Check row
        for (int j = 0; j < 9; j++) {

            if (board[row][j] == digit) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {

            if (board[i][col] == digit) {
                return false;
            }
        }

        // Check 3x3 box
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow;
             i < startRow + 3;
             i++) {

            for (int j = startCol;
                 j < startCol + 3;
                 j++) {

                if (board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}
