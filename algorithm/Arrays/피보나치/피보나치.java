package Arrays.피보나치;

import java.util.*;

 class Main {
    public int[] solution(int n) {
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;
        for(int i=2;i<n;i++) {
            result[i] = result[i-1] + result[i-2];
        }

        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        for(int x : T.solution(n)){
            System.out.print(x+" ");
        }
    }
}