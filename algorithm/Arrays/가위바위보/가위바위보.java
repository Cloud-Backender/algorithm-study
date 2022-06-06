package Arrays.가위바위보;

import java.util.*;

 class Main {
    public String solution(int n, int[] a, int[] b) {
        String result = "";
        for(int i=0; i<n; i++) {
            if(a[i]==b[i]) result+="D"; //드로우
            else if(a[i]==1 && b[i]==3) result+="A";
            else if(a[i]==2 && b[i]==1) result+="A";
            else if(a[i]==3 && b[i]==2) result+="A";
            else result+="B";
        }
        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = kb.nextInt();
        }
        for(int i=0; i<n; i++) {
            b[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, a, b));
    }
}