class Solution {
    public char kthCharacter(int k) {
        // Find the minimum number of operations needed
        int length = 1;
        int operations = 0;
        while (length < k) {
            length *= 2;
            operations++;
        }
        
        // Work backwards to find the number of transformations
        int transformations = 0;
        int pos = k;
        int currentLength = length;
        
        for (int op = operations; op > 0; op--) {
            int halfLength = currentLength / 2;
            if (pos > halfLength) {
                // This character came from the transformed part
                transformations++;
                pos -= halfLength;
            }
            currentLength = halfLength;
        }
        
        // The original character was 'a', apply transformations
        char result = 'a';
        for (int i = 0; i < transformations; i++) {
            result = (char) ((result - 'a' + 1) % 26 + 'a');
        }
        
        return result;
    }
}