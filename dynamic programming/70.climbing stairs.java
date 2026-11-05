


class Solution {
    public int climbStairs(int n) {
        int f = 1, l = 1, temp = 0;

        for (int i = 2; i <= n; i++) {
            temp = f + l;
            f = l;
            l = temp;
        }

        return l;
    }
}
