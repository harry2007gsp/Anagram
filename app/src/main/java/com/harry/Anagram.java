package com.harry;

/**
 * Created by hsingh on 8/13/15.
 */
public class Anagram {

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
