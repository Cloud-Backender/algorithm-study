package algorithm.문자찾기;
import java.util.*;

class Main{

    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        // \\\\\\\\\\\\\기본적인 for문법\\\\\\\\\\\\\\\
        // for (int i=0; i<str.length();i++) {
        //     if(str.charAt(i) == c) answer++;
        // }

        // \\\\\\\\\\\\\for each\\\\\\\\\\\\\\\
        for(char d : str.toCharArray()) {
            if(d == c) answer++;
        }

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = scanner.next().charAt(0);
        System.out.println(T.solution(str, c));
    }
}