package org.codesignalcore;

public class VD29 {
    static boolean solution(String cell1, String cell2) {
        //1 = trang
        //0 = den
        int[][] board = {{1,0,1,0,1,0,1,0} ,
                        {0,1,0,1,0,1,0,1},
                        {1,0,1,0,1,0,1,0},
                        {0,1,0,1,0,1,0,1},
                        {1,0,1,0,1,0,1,0},
                        {0,1,0,1,0,1,0,1},
                        {1,0,1,0,1,0,1,0},
                        {0,1,0,1,0,1,0,1}};
        /// Get number for Character
            char[] chars1 = cell1.toCharArray();
            char[] chars2 = cell2.toCharArray();
            char targetChar1 = chars1[0];
            char targetChar2 = chars2[0];
            // get int in the String
            int notenumber1 = Integer.parseInt(String.valueOf(chars1[1]));
            int notenumber2 = Integer.parseInt(String.valueOf(chars2[1]));
            // alphabet range
            char startChar = 'A';
            char endChar = 'Z';
            // assigned number innitial value
            int num1 = 0;
            int num2 = 0;
            // for cell1
            for (char c = startChar; c <= endChar; c++) {
                int number = c - startChar;
                if (c == targetChar1) {
                    //modify num1 value base on the character number
                    num1 = number;
                    break;
                }
            }
            // for cell2
            for (char c = startChar; c <= endChar; c++) {
                int number = c - startChar;
                if (c == targetChar2) {
                    num2 = number;
                    break;
                }
            }
        //System.out.print(num1 + " " + num2);
        int a = notenumber1 - 1;
        int b = notenumber2 - 1;

        return board[num1][a] == board[num2][b];
//        if (board[num1][a] == board[num2][b]) {
//            System.out.print(num1 + " " + notenumber1 + "\n");
//            System.out.print(num2 + " " + notenumber2);
//            //System.out.println(true);
//        }
//        else System.out.println(false);
//        System.out.println("\n");
//        System.out.print(num1 + " " + notenumber1 + "\n");
//        System.out.print(num2 + " " + notenumber2);

    }

    public static void main(String[] args) {
        solution("B3","H8");
    }
}
