package org.codesignalcore;

public class VD28 {
    static String solution(String inputString) {
        String s = "";
        int len = inputString.length();
        for(int x = 0; x < len; x++){
            char c = (char)(inputString.charAt(x) + 1);
            if (c > 'z')
                s += (char)(inputString.charAt(x) - (26-1));
            else
                s += (char)(inputString.charAt(x) + 1);
        }
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {
        String a = "crazy";
        solution(a);
    }
}
