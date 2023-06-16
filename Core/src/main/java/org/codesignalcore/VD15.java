package org.codesignalcore;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class VD15 {
    static String[] solution(String[] picture) {
        String[] framedPicture = new String[picture.length + 2];

        for(int i = 0 ; i < picture.length ; i++) {
            framedPicture[i+1] = '*' + picture[i] + '*';
        }

        framedPicture[0] = framedPicture[picture.length + 1] = framedPicture[1].replaceAll(".","*");
        System.out.println(framedPicture);
        return framedPicture;
    }

    public static void main(String[] args) {
        String[] test = {"abc","ded"};
        solution(test);
    }
}
