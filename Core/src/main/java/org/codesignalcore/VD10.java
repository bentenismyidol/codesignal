package org.codesignalcore;

public class VD10 {
    static int solution(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (char c : s1.toCharArray()) {
            count1[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            count2[c - 'a']++;
        }
        int commonCount = 0;
        for (int i = 0; i < 26; i++) {
            commonCount += Math.min(count1[i], count2[i]);
        }
        return commonCount;
    }

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        System.out.println(solution(s1,s2));
    }
}
