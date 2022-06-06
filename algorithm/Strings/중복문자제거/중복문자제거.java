package algorithm.중복문자제거;

 
import java.util.*;

class Main{
    public String solution(String str){
        StringBuilder result = new StringBuilder();
        char[] charArray = str.toCharArray();
        result.append(charArray[0]);
        for (char c : charArray) {
            if(c != charArray[0]) {
                result.append(c);
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
