class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] arr = new int[26];

        // Store frequency of s1
        for (char c : s1.toCharArray()) {
            arr[c - 'a']++;
        }

        int left = 0, right = 0;
        int count = s1.length();

        while (right < s2.length()) {
            if (arr[s2.charAt(right) - 'a'] > 0) {
                count--;
            }

            arr[s2.charAt(right) - 'a']--;
            right++;
            if (count == 0) return true;
            if (right - left == s1.length()) {
                if (arr[s2.charAt(left) - 'a'] >= 0) {
                    count++;
                }
                arr[s2.charAt(left) - 'a']++;
                left++;
            }
        }

        return false;
    }
}