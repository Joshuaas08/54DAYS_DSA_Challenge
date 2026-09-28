class Solution {

    private final String[] letters = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        backtrack(
            digits,
            0,
            new StringBuilder(),
            result
        );

        return result;
    }

    private void backtrack(
            String digits,
            int index,
            StringBuilder current,
            List<String> result) {

        // Complete combination
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';

        String possibleLetters = letters[digit];

        for (char c : possibleLetters.toCharArray()) {

            // Choose
            current.append(c);

            // Explore
            backtrack(
                digits,
                index + 1,
                current,
                result
            );

            // Undo
            current.deleteCharAt(current.length() - 1);
        }
    }
}
