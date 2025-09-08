class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i = 1;
        int j = n - i;

        while (hasZero(i) || hasZero(j)) {
            i++;
            j = n - i;
        }

        return new int[]{i, j};
    }

    private boolean hasZero(int num) {
        return String.valueOf(num).contains("0");
    }
}
