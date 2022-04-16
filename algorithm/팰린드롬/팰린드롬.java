package 팰린드롬;
 
import java.util.*;

class Main{
    public String solution(String str){
        String result = "NO";

        str=str.toUpperCase().replaceAll("[^A-Z]", "");
        
        String tmp = new StringBuilder(str).reverse().toString();

        if (str.equals(tmp)) result="YES";

        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
