package com.vinay.practice.lc;

// https://leetcode.com/problems/longest-repeating-character-replacement


public class LongestCharacterReplacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            arr[s.charAt(j) - 'A']++;
            max = Math.max(max, arr[s.charAt(j) - 'A']);
            if (j - i + 1 - max > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }

    /*
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> counts = new HashMap<>();

        int left = 0;
        int right = 0;
        int longestLength = 0;

        while (right < s.length()) {
            Character curr = s.charAt(right);
            counts.put(curr, counts.getOrDefault(curr, 0) + 1);

            Object[] values = counts.values().toArray();
            int maxFreq = 0;
            for (Object value : values) {
                maxFreq = Math.max(maxFreq, (int) value);
            }

            if (right - left + 1 - maxFreq > k) {
                counts.put(s.charAt(left), counts.get(s.charAt(left)) - 1);
                left ++;
            }

            longestLength = Math.max(longestLength, right - left + 1);
            right ++;
        }

        return longestLength;
    }
    */

}
