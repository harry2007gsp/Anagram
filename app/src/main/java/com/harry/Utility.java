package com.harry;

/**
 * Created by hsingh on 8/13/15.
 */
public class Utility {

    public static char firstNonRepeatingCharacter(String string) {
        char[] chars = string.toCharArray();
        int t=0;
        for (int i = 0; i < string.length(); i++) {
            boolean found = true; // first one is by default different and non-repeating before logic
            for (int j = 0; j < string.length(); j++) {
                if (i == j) { // no need to check iteration which is matched
                    continue;
                }
                if (chars[i] == chars[j]) {
                    found = false; // if some char is equal then make it false as it is existing
                    break;
                }
            }
            if (found) {
                t=i;
            }
        }
        return chars[t];
    }

    public static boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] chars = first.toCharArray();
        for (char c : chars) {
            int index = second.indexOf(c);
            if (index != -1) {
                second = second.substring(0, index) + second.substring(index + 1, second.length());
            }else {
                return false;
            }
        }
        return second.isEmpty();
    }

    public static boolean isAnagram1(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] chars = first.toCharArray();
        StringBuilder sb = new StringBuilder(second);
        for (char c : chars) {
            int index = sb.indexOf(""+c);
            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sb.length()==0?true:false;
    }
}
