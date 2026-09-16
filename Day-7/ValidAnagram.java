// Problem:-
// Given two strings s and t, return true if t is an anagram of s, otherwise return false.
// Complexity:-
// Time: O(n)
// Space: O(1)


public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        boolean result = va.isAnagram(s, t);
        System.out.println(result);
    }
}