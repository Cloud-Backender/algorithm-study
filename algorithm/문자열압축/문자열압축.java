package 문자열압축;

 
import java.util.*;

class Main{
    public String solution(String str){
        String result = "";
        str=str+" ";

        int duplicationNum = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                duplicationNum +=1;
            } else {
                result = result+str.charAt(i);
                if(duplicationNum > 1) {
                    result = result + String.valueOf(duplicationNum);
                    duplicationNum = 1;
                }
            }
        }


        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}

