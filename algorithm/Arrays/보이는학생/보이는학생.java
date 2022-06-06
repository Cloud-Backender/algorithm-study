package Arrays.보이는학생;

import java.util.*;

 class Main {
    public int solution(int n, int[] arr) {
        int result = 1; //첫번째 학생은 무조건 보임.
        int student_max_cm = arr[0];

        for (int i=1; i<n; i++) {
            if(student_max_cm >= arr[i]) {
                
            } else {
                result += 1;
                student_max_cm = arr[i];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}