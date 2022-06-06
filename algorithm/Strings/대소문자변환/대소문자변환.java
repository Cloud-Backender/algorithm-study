package algorithm.대소문자변환;
import java.util.*;

class Main{

    public String solution(String str) {
        String answer = "";
        for(char c : str.toCharArray()){
            // \\\\\\\\\함수로 대소문자 변경 \\\\\\\\\\\\\
            // if(Character.isLowerCase(c)) answer += Character.toUpperCase(c);
            // else answer += Character.toLowerCase(c);

            
            /*
            \\\\\\\\\\\ASCII 번호로 대소문자 변경 \\\\\\\\\\\\\\\\
            A-Z -> 65~90
            a-z -> 97~112
            대소문자 변환 -> 32차이
            */
            if(c >= 65 && c <= 90) answer += Character.toLowerCase(c); //대문자인가... 체크
            else answer += (char)(c-32); //소문자 - 32 = 대문자

        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution(str));
    }
}