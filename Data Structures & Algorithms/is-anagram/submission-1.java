class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> countChar = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            countChar.put(s.charAt(i), countChar.getOrDefault(s.charAt(i), 0) + 1);
            countChar.put(t.charAt(i), countChar.getOrDefault(t.charAt(i), 0) - 1);
        }

        return countChar.values()
            .stream()
            .allMatch(count -> count == 0);
    }
}
