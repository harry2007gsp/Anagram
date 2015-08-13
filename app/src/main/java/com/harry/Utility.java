package com.harry;

import java.util.ArrayList;

/**
 * Created by hsingh on 8/13/15.
 */
public class Utility {

    public static ArrayList<Character> allDuplicateCharactersInString(String string) {
        ArrayList<Character> words = new ArrayList<Character>();
        for (int i = 0; i < string.length(); i++) {
            boolean found = false;
            for (int j = 0; j < string.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (string.charAt(i) == string.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if(found) {
                words.add(string.charAt(i));
            }
        }
        return words;
    }
    public static char firstDuplicateCharactersInString(String string) {
        int t=0;
        for (int i = 0; i < string.length(); i++) {
            boolean found = false;
            for (int j = 0; j < string.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (string.charAt(i) == string.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                t=i;
            }
        }
        return string.charAt(t);
    }
    public static char firstNonRepeatingCharacter(String string) {
//        char[] chars = string.toCharArray();
        int t=0;
        for (int i = 0; i < string.length(); i++) {
            boolean found = true; // first one is by default different and non-repeating before logic
            for (int j = 0; j < string.length(); j++) {
                if (i == j) { // no need to check iteration which is matched
                    continue;
                }
                if (string.charAt(i) == string.charAt(j)) {
                    found = false; // if some char is equal then make it false as it is existing
                    break;
                }
            }
            if (found) {
                t=i;
            }
        }
        return string.charAt(t);
    }

    public static ArrayList<Character> otherCharacters(String string) {
        ArrayList<Character> words = new ArrayList<Character>();
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i)==' '){
                continue;
            }
            if (!Character.isAlphabetic(string.charAt(i))) {
                words.add(string.charAt(i));
            }
        }
        return words;
    }

    public static boolean stringContainsOnlyNumbers(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }return true;
    }

    public static String reverseString(String string) {
        char[] words = string.toCharArray();
        char[] newWords = new char[string.length()];
        for(int i=0;i<words.length;i++) {
            newWords[i] = words[string.length() - 1-i];
        }
        return new String(newWords);
    }

    public static String reverseString1(String string) {
        StringBuilder sb = new StringBuilder();
        for(int i=string.length()-1;i>=0;i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
//        return sb.reverse().toString();
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
