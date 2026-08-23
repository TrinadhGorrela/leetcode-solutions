/**
 * 3918. Sum of Primes Between Number and Its Reverse
 * Difficulty: Medium | Tags: Math, Number Theory
 * https://leetcode.com/problems/sum-of-primes-between-number-and-its-reverse/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class SumOfPrimesBetweenNumberAndItsReverse {
    public int sumOfPrimesInRange(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            int last = temp % 10;
            rev = rev * 10 + last;
            temp /= 10;
        }

        int st = Math.min(n, rev);
        int end = Math.max(n, rev);
        int res = 0;

        for (int i = st; i <= end; i++) {
            if (isPrime(i)) {
                res += i;
            }
        }
        return res;
    }

    public static boolean isPrime(int n) {

        if (n == 0 || n == 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
