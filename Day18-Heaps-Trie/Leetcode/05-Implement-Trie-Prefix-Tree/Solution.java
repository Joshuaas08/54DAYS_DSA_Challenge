class Trie {

    // Each node contains links to child characters
    private static class TrieNode {

        TrieNode[] children = new TrieNode[26];

        boolean isEnd;
    }

    private final TrieNode root;

    public Trie() {

        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode current = root;

        for (char c : word.toCharArray()) {

            int index = c - 'a';

            if (current.children[index] == null) {

                current.children[index] =
                        new TrieNode();
            }

            current = current.children[index];
        }

        // Mark end of complete word
        current.isEnd = true;
    }

    public boolean search(String word) {

        TrieNode node = findNode(word);

        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {

        return findNode(prefix) != null;
    }

    private TrieNode findNode(String word) {

        TrieNode current = root;

        for (char c : word.toCharArray()) {

            int index = c - 'a';

            if (current.children[index] == null) {
                return null;
            }

            current = current.children[index];
        }

        return current;
    }
}
