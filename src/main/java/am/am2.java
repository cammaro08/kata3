package am;

import java.util.Random;


public class am2 {

    public int find_min(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
    private Random r = new Random();

    public int[] solution(int N) {
        // write your code in Java SE 8
        if (N == 1) {
            return new int[]{-1};
        }
        int firstElement = r.nextInt();
        int[] result = new int[N];
        result[0] = firstElement;
        for (int i = 1; i < N; i++) {
            result[i] = generateRandomValue(firstElement+2);
        }
        return result;
    }


    private int generateRandomValue(int min) {
        return (int) (Math.random() * ((Integer.MAX_VALUE - min)) + min);
    }


}
