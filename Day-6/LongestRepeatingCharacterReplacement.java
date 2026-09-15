// Problem:-
// Given a string s and an integer k, 
// return the length of the longest substring that can be made to contain only the same character by replacing at most k characters.
// Complexity:-
// Time: O(n)
// Space: O(1)


public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            int windowLength = right - left + 1;

            // Characters that need to be replaced
            int replacements = windowLength - maxFreq;

            if (replacements > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement solution = new LongestRepeatingCharacterReplacement();
        String s = "AABABBA";
        int k = 1;
        int result = solution.characterReplacement(s, k);
        System.out.println("The length of the longest substring after replacement is: " + result);
    }
}
