//Finding the Longest Palindrome in an Array
package in.assignment3;

import java.util.Arrays;

public class assign11 {

	    public static String longestPalindrome(String s) {
	        if (s == null || s.length() == 0) {
	            return "";
	        }
	        int start = 0, end = 0;
	        for (int i = 0; i < s.length(); i++) {
	            int len1 = expandAroundCenter(s, i, i);
	            int len2 = expandAroundCenter(s, i, i + 1);
	            int len = Math.max(len1, len2);

	            if (len > end - start) {
	                start = i - (len - 1) / 2;
	                end = i + len / 2;
	            }
	        }

	        return s.substring(start, end + 1);
	    }

	    private static int expandAroundCenter(String s, int left, int right) {
	        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
	            left--;
	            right++;
	        }
	        return right - left - 1;
	    }
	    public static void main(String[] args) {
	        String[] testCases = { "cbbd", "a", "level", "abcddcbab"};

	        for (String s : testCases) {
	            System.out.println("Longest palindrome in \"" + s + "\" is: " + longestPalindrome(s));
	        }
	    }
	}

