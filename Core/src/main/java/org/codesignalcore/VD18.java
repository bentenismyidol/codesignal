package org.codesignalcore;

import java.util.*;

public class VD18 {
    static boolean solution(String inputString) {
//        int map = 0;
//        for(int i=0; i<inputString.length(); i++) {
//            map ^= 1 << (inputString.charAt(i) - 'a');
//            // ^ : xor
//            // << : The left shift operator moves all bits by a given number of bits to the left.
//        }
//        return map == 0 || (map & -map) == map;
        Set<Character> chars = new HashSet<Character>();

        for (int i = 0; i < inputString.length();  ++i) {
            char c = inputString.charAt(i);
            if (chars.contains(c)) {
                chars.remove(c);
            }
            else {
                chars.add(c);
            }
        }
        return chars.size() <= 1 ? true : false;
    }

    public static void main(String[] args) {
        String a = "aabb";
        solution(a);
    }
}
