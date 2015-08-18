package com.harry;

import android.text.TextUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by hsingh on 8/13/15.
 */
public class Utility {

    public static String removeDuplicateCharacters(String string) {
        char[] characters = string.toCharArray();//bananas
        ArrayList<Character> newCharacters = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            boolean found = true;
            for (int j = 0; j < string.length(); j++) {
                if(i==j)
                    continue;
                if (newCharacters.contains(characters[i])) {
                    found = false;
                    break;
                }
            }
            if (found) {
                newCharacters.add(characters[i]);
            }

        }
        String s = newCharacters.toString();
        return s;
    }

    public static boolean palindrome(String string) {
        String reverse = "";
        for (int i = 0; i < string.length(); i++) {
            reverse = reverse + string.charAt(string.length() - i - 1);
        }
        if (reverse.equals(string)) {
            return true;
        } else {
            return false;
        }
    }

//    public static int permutationsOfString(String string) {
//        int n = string.length();
//        int p = Utility.factorial(n);
//        return p;
//    }

    public static int factorial(int integer) {
        int result = 1;
        for (int i = 1; i <= integer; i++) {
            result *=i;
        }
        return result;
    }

    public static String integerToString(int integer) {
        String s = "";
//         s = ""+integer;
//         s = String.valueOf(integer);
//         s = Integer.toString(integer);
//         s = String.format("%d", integer);
        return s;
    }

    public static int occurrenceOfCharacterInString(String string, char c) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (char character : chars) {
            if (character == c) {
                count++;
            }
        }
        return count;
    }

    public static HashMap<String,Integer> countVowels(String string) {
        char[] chars = string.toCharArray();
        int vowelsCount = 0;
        int nonVowels = 0;
        HashMap<String, Integer> values = new HashMap<>();
        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelsCount++;
            } else {
                nonVowels++;
            }
        }
        values.put("vowelsCount", vowelsCount);
        values.put("nonVowels", nonVowels);
        values.put("stringLength", string.length());
        return values;
    }

    public static ArrayList<String> allDifferntWordsInStringSentence(String string) {
        ArrayList<String> differentWords = new ArrayList<String>();
        String[] words = string.split(" ");
        for (int i = 0; i<words.length; i++) {
            boolean found = true;
            for (int j = 0; j < words.length; j++) {
                if (i == j) {
                    continue;
                }
                if (words[i].equals(words[j])) {
                    found = false;
                    break;
                }
            }
            if (found) {
                differentWords.add(words[i]);
            }
        }
        return differentWords;
    }

    public static ArrayList<Character> allDuplicateCharactersInString(String string) {
        ArrayList<Character> characters = new ArrayList<Character>();
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
                characters.add(string.charAt(i));
            }
        }
        return characters;
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

    public static String reverseStringWithWords(String string) {
        String[] words = string.split(" ");
        String[] newWords = new String[words.length];
        // 1st method with String Builder
//        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            newWords[i] = words[words.length - 1-i];
//            sb.append(words[words.length - 1 - i]+" ");
        }
        String sb = "";
        for (String word : newWords) {
            sb = sb + word + " ";
        }
        // 2nd method with Arrays class or TextUtils
//        String newString = TextUtils.join(" ", newWords);
//        String sb = Arrays.toString(newWords);
//        sb = sb.substring(1, sb.length() - 1).replace(",","");
//        sb = sb.replace(",","");
        return sb;
//        return sb.toString();
    }

    public static String reverseString(String string) {
        char[] characters = string.toCharArray();
        char[] newCharacters = new char[string.length()];
        for(int i=0;i<characters.length;i++) {
            newCharacters[i] = characters[string.length() - 1-i];
        }
        return new String(newCharacters);
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
