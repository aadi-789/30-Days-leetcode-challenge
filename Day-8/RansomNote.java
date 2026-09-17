// Problem:-
// Given two strings ransomNote and magazine, return true if ransomNote can be constructed using the letters from magazine. 
// Each letter from magazine can be used only once.
//complexity: O(n)
//space complexity: O(1)


public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            freq[ch - 'a']--;

            if (freq[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
