package org.codesignalcore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VD16 {
    static boolean solution(int[] a, int[] b) {
         List<Integer> list = new ArrayList<Integer>();
        for (int i = 0 ; i < a.length; i++) {
            if (a[i] != b[i]) {
                list.add(a[i]);
            }
        }
        Collections.swap(list,0,1);
        if (b[0] != list.get(0) || list.size() > 2) {
            System.out.println("false");
            return false;
        }
        else {
            System.out.println("true");
            return true;
        }
    }
    /* int rs = 0, s1 = 1, s2 = 1;
    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i])
            rs++;
        s1 *= a[i];
        s2 *= b[i];
    }
    return rs <= 2 && s1 == s2;
    */


    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1, 2, 1};
        int[] b = {2, 2, 1, 2, 2, 1};
        solution(a,b);
    }
}
