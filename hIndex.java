class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] bucket = new int[n + 1];

        // Step 1: Count citations 
        for (int i = 0; i < n; i++) {
            int c = citations[i];
            if (c >= n) {
                bucket[n]++;
            } else {
                bucket[c]++;
            }
        }

        // Step 2: Traverse from end to find the h-index
        int count = 0;
        for (int i = n; i >= 0; i--) {
            count += bucket[i];
            if (count >= i) {
                return i;
            }
        }

        return 0;
    }
}
