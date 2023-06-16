package org.codesignalcore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class VD12 {
    public static int[] solution(int[] a) {
        //sử dụng list để xắp sếp cac phần tử khác -1 của a
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i : a) {
            if (i != -1) {
                list.add(i);
            }
        }

        Collections.sort(list);
        //thay thế các phần tử khác -1 của a lần lượt bằng các phần tử đã được xắp sếp từ list
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = list.get(index++);
            }
            System.out.print(a[i] + " ");
        }

        return a;
    }




    public static void main (String[]args){
            int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
            solution(a);
        }
}
