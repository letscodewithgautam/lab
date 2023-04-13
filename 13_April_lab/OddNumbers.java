package april_13_23_lab;

import java.util.ArrayList;

public class OddNumbers {  // oddNumber class created

    private ArrayList<Integer> A1;
    private ArrayList<Integer> A2;
    //storeOddNumbers method created
    public ArrayList<Integer> storeOddNumbers(int N) {
        A1 = new ArrayList<Integer>();
        for (int i = 2; i <= N; i += 2) {
            A1.add(i);
        }
        return A1;
    }
    // printOddNumbers method created
    public ArrayList<Integer> printOddNumbers() {
        A2 = new ArrayList<Integer>();
        for (int num : A1) {
            int result = num * 5;
            System.out.print(result);
            A2.add(result);
            if (num < A1.get(A1.size() - 1)) {
                System.out.print(",");
            }
        }
        System.out.println();
        return A2;
    }
    // retrieveOddNumber method created
    public int retrieveOddNumber(int N) {
        if (A1.contains(N)) {
            return N;
        } else {
            return 0;
        }
    }
}
