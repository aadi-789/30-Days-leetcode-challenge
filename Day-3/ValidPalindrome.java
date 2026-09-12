// Problem
// Given a string s, determine if it is a palindrome after converting uppercase letters to lowercase and removing all non-alphanumeric characters.
// Complexity
// Time: O(n)
// Space: O(1)


class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        String input = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(input);
        System.out.println(result);
    }   
}