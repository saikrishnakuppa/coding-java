package com.coding.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
    /*
    public static boolean findPermutation(String str, String pattern) {
        Map<Character, Integer> s1Count = new HashMap<>();
        Map<Character, Integer> s2Count = new HashMap<>();

        for(char ch: pattern.toCharArray()){
            s1Count.put(ch, (s1Count.getOrDefault(ch, 0) + 1));
            s2Count.put(ch, (s2Count.getOrDefault(ch, 0) + 1));
        }
        int windowStart = 0;
        int matched = 0;
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd ++) {
            char end = str.charAt(windowEnd);
            if (characterCount.containsKey(end)) {
                characterCount.put(end, characterCount.get(end) - 1);
                if (characterCount.get(end)  == 0){
                    matched++;
                }
            }
            if (matched == characterCount.size()) {
                return true;
            }
            if (windowEnd >= pattern.length() - 1){
                char start = str.charAt(windowStart++);
                if(characterCount.containsKey(start)) {
                    if(characterCount.get(start) == 0) {
                        matched--;
                    }
                    characterCount.put(start, characterCount.get(start) + 1);
                    System.out.println(characterCount.get(end));
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //System.out.println(findPermutation("aaacb", "abc"));
        //System.out.println(findPermutation("odicf", "dc"));
        //System.out.println(findPermutation("aaacb", "abc"));
        System.out.println(findPermutation("ab", "eidbaooo"));
    }
    */
}
