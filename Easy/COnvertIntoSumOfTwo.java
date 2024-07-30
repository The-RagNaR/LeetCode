package Easy;

/**
 * https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
 * 
 */
public class COnvertIntoSumOfTwo {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (!containsZero(i) && !containsZero(j)) {
                return new int[]{i, j};
            }
        }
        return new int[]{-1, -1}; // In case no valid pair is found, which shouldn't happen as per problem constraints
    }

    private boolean containsZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return true;
            }
            num /= 10;
        }
        return false;
    }
    
}
