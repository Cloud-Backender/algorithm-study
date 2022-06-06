package 암호화;
 
import java.util.*;

class Main{
    public String solution(int n, String str){
        String result = "";
        
        for(int i=0; i<n; i++) {
            String tmp=str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2); //2진수 
            result += (char)num;
            str=str.substring(7);
        }

        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(T.solution(n, str));
        //인자 : 4, #****###**#####**#####**##** 
    }
}
