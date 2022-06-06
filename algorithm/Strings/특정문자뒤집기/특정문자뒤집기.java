package algorithm.특정문자뒤집기;

 
import java.util.*;

class Main{
    public String solution(String str){
        String result = "";
        char[] s=str.toCharArray();

        int lt=0, rt=str.length()-1; //lt는 맨 처음 문자, rt는 맨 끝 문자
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])){
                lt++;
            } else if(!Character.isAlphabetic(s[rt])){
                rt--;
            } else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        result = String.valueOf(s); //스트링화
        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
