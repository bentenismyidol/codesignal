package org.codesignalcore;

public class VD13 {
    static String solution(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while (str.indexOf("(") != -1) {
            //tìm dấu '(' cuối cùng
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start + 1, end)).reverse().toString());
            System.out.println(str);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String input = "foo(bar(baz))blim";
        solution(input);
    }
}
