package algorithm.단어뒤집기;

 
import java.util.*;

class Main{
    public List<String> solution(int n, String[] str){
        List<String> result = new ArrayList<>();
        for(String d : str) {
            String tmp = new StringBuilder(d).reverse().toString();
            result.add(tmp);
        }

        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scanner.next();
        }

        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
