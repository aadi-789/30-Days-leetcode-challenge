// Problem:-
// Given strings s and t, return the minimum window substring of s that contains all characters of t, 
// including duplicates. If no such substring exists, return "".
// Complexity:-
// Time: O(n)
// Space: O(1)


public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];
        int[] window = new int[128];

        for (char ch : t.toCharArray()) {
            need[ch]++;
        }

        int left = 0;
        int right = 0;

        int formed = 0;
        int required = t.length();

        int minLength = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);
            window[ch]++;

            // This character contributes to satisfying t
            if (need[ch] > 0 && window[ch] <= need[ch]) {
                formed++;
            }

            right++;

            // Current window contains all characters of t
            while (formed == required) {

                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;

                // We removed a required character
                if (need[leftChar] > 0 &&
                    window[leftChar] < need[leftChar]) {
                    formed--;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
    public static void main(String[] args) {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solution.minWindow(s, t);
        System.out.println("The minimum window substring is: " + result);
    }
}
