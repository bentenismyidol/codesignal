package org.codesignalcore;

public class VD22_ques {
    static int solution(int[] inputArray) {
        int jump = 1;
        boolean fail = true;

        while(fail) {
            jump++;
            fail = false;
            for(int i=0; i<inputArray.length; i++)
                if(inputArray[i]%jump==0) {
                    fail = true;
                    break;
                }
        }
        System.out.println(jump);
        return jump;
    }

    public static void main(String[] args) {
        int[] inputArray = {5,3,6,7,9};
        solution(inputArray);
    }
}
