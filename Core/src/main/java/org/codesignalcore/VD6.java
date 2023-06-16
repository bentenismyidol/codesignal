package org.codesignalcore;

import java.util.Arrays;

public class VD6 {
    static int solution(int[] statues) {
        Arrays.sort(statues);
        int count = 0;
        for (int i =0;i< statues.length-1;i++) {
            if (statues[i+1] - statues[i] != 1  ) {
                count += statues[i+1] - statues[i] -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int[] statues = new int[] {6,2,3,8};
        System.out.println(solution(statues));
    }
}
