class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int start = 0, maxLen = 0;

        for(int end = 0; end < s.length(); end++) {
            char car = s.charAt(end);

            while(set.contains(car)) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(car);
            maxLen = Math.max(maxLen, (end - start) + 1);
        }

        return maxLen;
    }
}