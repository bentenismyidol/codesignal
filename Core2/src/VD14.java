import java.util.ArrayList;

public class VD14 {
    static int[] solution(int[] a) {
        ArrayList<Integer> sumarray1 = new ArrayList<Integer>();
        ArrayList<Integer> sumarray2 = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            sumarray1.add(a[i]);
            sumarray2.add(a[i + 1]);
            i++;
        }
        for (int i : sumarray1) {
            System.out.println(i);
        }
        for (int i : sumarray2) {
            System.out.println(i);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {50, 60, 60, 45, 70};
        solution(a);
    }
}
