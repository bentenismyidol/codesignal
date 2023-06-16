package org.codesignalcore;

public class VD27 {
    static boolean solution(String name) {
        return name.matches("[a-zA-Z_][a-zA-Z0-9_]*");
    }

    public static void main(String[] args) {
        String name = "var_1__Int";
        String name2 = "qq-q";
        String name3 = "2w2";
        solution(name);
        solution(name2);
        solution(name3);
    }
}
