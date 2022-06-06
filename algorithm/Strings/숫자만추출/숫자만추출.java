package 숫자만추출;

 
import java.util.*;

class Main{
    public int solution(String str){
        //case1 
        //         int result = 0;
        // for(char x : str.toCharArray()) {
        //     if (x>=48 && x<= 57) {
        //         result = result * 10 + (x-48); //실제 숫자를 뽑기 위해선 -48 해줘야함 . 
        //     }
        // }
        //        return result;

        //case2
        String result = "";
        for(char x : str.toCharArray()) {
            if (x >= 48 && x <= 57) {
                result = result + x;
            }
        }
        return Integer.parseInt(result);
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(T.solution(str));
    }
}
