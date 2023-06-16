package org.codesignalcore;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class VD14 {
    static int[] solution(int[] a) {
        int sum1= 0,sum2 = 0;
        List<Integer> sumarray = new ArrayList<>();
        List<Integer> temp = new ArrayList<Integer>();
        for (int t : a) {
            temp.add(t);
        }
        List<Integer> sumarray1 = new ArrayList<Integer>();
        List<Integer> sumarray2 = new ArrayList<Integer>();
        for (int i = 0; i < temp.size(); i++) {
            sumarray1.add(temp.get(i));
            i++;
        }
        for (int i = 1; i < temp.size(); i++) {
            sumarray2.add(temp.get(i));
            i++;
        }
        for (int i : sumarray1) {
            sum1 += i;
        }
        for (int i : sumarray2) {
            sum2 += i;
        }
        sumarray.add(sum1);
        sumarray.add(sum2);
        int[] total = new int[sumarray.size()];
        for (int i = 0;i< sumarray.size();i++) {
            total[i] = sumarray.get(i);
        }
        for (int i : total) {
            System.out.println(i + " ");
        }
        return total;
    }

    public static void main(String[] args) {
        int[] a = {80};
        solution(a);
    }
}
