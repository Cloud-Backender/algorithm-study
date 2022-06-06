package algorithm.문장속단어;

import java.util.*;

class Main{
    public String solution(String str){
        String result = "";
        String[] strings = str.split(" ");
        result = strings[0];
        for (int i = 1;i<strings.length;i++) {
            if(strings[i].length() > result.length()) {
                result = strings[i];
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
