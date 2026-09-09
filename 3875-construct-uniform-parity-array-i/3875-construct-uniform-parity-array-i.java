class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd = 0, even = 0;

        for (int x : nums1) {
            if (x % 2 == 0)
                even++;
            else
                odd++;
        }

        if (odd == 0 || even == 0)
            return true;

        return true;
    }
}