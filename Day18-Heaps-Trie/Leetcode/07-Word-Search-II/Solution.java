class Solution {

    private static class TrieNode {

        TrieNode[] children = new TrieNode[26];

        String word;
    }

    private TrieNode root;

    private int rows;
    private int cols;

    public List<String> findWords(
            char[][] board,
            String[] words) {

        List<String> result = new ArrayList<>();

        root = new TrieNode();

        // Build Trie from all words
        for (String word : words) {
            insert(word);
        }

        rows = board.length;
        cols = board[0].length;

        // Start DFS from every cell
        for (int r = 0; r < rows; r++) {

            for (int c = 0; c < cols; c++) {

                dfs(board, r, c, root, result);
            }
        }

        return result;
    }

    private void insert(String word) {

        TrieNode current = root;

        for (char c : word.toCharArray()) {

            int index = c - 'a';

            if (current.children[index] == null) {

                current.children[index] =
                        new TrieNode();
            }

            current = current.children[index];
        }

        // Store complete word at the end
        current.word = word;
    }

    private void dfs(
            char[][] board,
            int row,
            int col,
            TrieNode node,
            List<String> result) {

        // Out of bounds
        if (row < 0 ||
            row >= rows ||
            col < 0 ||
            col >= cols) {

            return;
        }

        char c = board[row][col];

        // Already visited
        if (c == '#') {
            return;
        }

        int index = c - 'a';

        // Character does not exist in Trie
        if (node.children[index] == null) {
            return;
        }

        TrieNode next = node.children[index];

        // Found a complete word
        if (next.word != null) {

            result.add(next.word);

            // Prevent duplicate results
            next.word = null;
        }

        // Mark visited
        board[row][col] = '#';

        // Explore four directions
        dfs(board, row + 1, col, next, result);
        dfs(board, row - 1, col, next, result);
        dfs(board, row, col + 1, next, result);
        dfs(board, row, col - 1, next, result);

        // Undo
        board[row][col] = c;
    }
}
