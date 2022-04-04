package algorithm.회문문자열체크;


import java.util.Scanner;

class Main{
    public String solution(String str){
        String result = "";
        char[] strArray = str.toCharArray();
        int startNum = 0;
        int endNum = strArray.length-1;
        
        for(int i = 0; i<str.length()/2; i++) {
            if(strArray[startNum] == strArray[endNum]) {
                startNum += 1;
                endNum -= 1;
                result = "회문 문자입니다. ㅋㅋ";
                i++;
                continue;
            } else {
                result = "회문 문자가 아닙니다.";
                break;
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