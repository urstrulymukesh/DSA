class Solution {
    public int numOfSubarrays(int[] arr) {

        int n = arr.length;
        int MOD = 1000000007;

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        // Step 2: Count even and odd prefix sums
        long even = 0;
        long odd = 0;

        for (int i = 0; i <= n; i++) {
            if (prefix[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        // Step 3: Calculate number of odd-sum subarrays
        long ans = (even * odd) % MOD;

        return (int) ans;
    }
}