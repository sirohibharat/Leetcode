class Solution {
    public char kthCharacter(int k) {
        int length = 1;
        int operations = 0;
        while (length < k) {
            length *= 2;
            operations++;
        }
        int transformations = 0;
        int pos = k;
        int currentLength = length;
        
        for (int op = operations; op > 0; op--) {
            int halfLength = currentLength / 2;
            if (pos > halfLength) {
                transformations++;
                pos -= halfLength;
            }
            currentLength = halfLength;
        }
        char result = 'a';
        for (int i = 0; i < transformations; i++) {
            result = (char) ((result - 'a' + 1) % 26 + 'a');
        }
        return result;
    }
}