// Problem:-
// Given an array of strings, group the anagrams together.
// Complexity:-
// Time: O(n * k log k) where n is the number of strings and k is the maximum length of a string
// Space: O(n * k) for storing the grouped anagrams in the HashMap


import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = ga.groupAnagrams(strs);
        System.out.println(result);
    }

}