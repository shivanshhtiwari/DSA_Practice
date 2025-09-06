class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];
            ans += (getOperations(r) - getOperations(l - 1) + 1) / 2;
        }
        return ans;
    }

    // Helper: returns total operations needed for all integers in [1, n]
    private long getOperations(int n) {
        long res = 0;
        int ops = 0;
        // Iterate through increasing powers of 4
        for (long powerOfFour = 1; powerOfFour <= n; powerOfFour *= 4) {
            ops++;
            long l = powerOfFour;
            long r = Math.min(n, powerOfFour * 4 - 1);
            res += (r - l + 1) * ops;
        }
        return res;
    }
}
