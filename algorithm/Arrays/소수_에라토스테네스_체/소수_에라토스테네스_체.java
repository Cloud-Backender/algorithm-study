package Arrays.소수_에라토스테네스_체;

import java.util.*;


/**
 * 
 */
 class Main {
    public int solution(int n) {
        int result = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n; i++) {
            if(ch[i]==0) {
                result++;
                for(int j=i; j<=n; j=j+i) {
                    ch[j]= 1;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
         System.out.println(T.solution(n));
    }
}