import java.util.Scanner;

public class A20220126 {

    public String solution(String input){
        StringBuilder answer = new StringBuilder();
        char x = input.charAt(0);
        int num = 1;
        for(int i = 1 ; i<input.length();i++){
            if(x == input.charAt(i)){
                num ++;
                if(i == input.length()-1){
                    answer.append(String.valueOf(x)).append(num);
                }
            } else {
                answer.append(x);
                if(num > 1){
                    answer.append(num);
                }
                num = 1;
                x = input.charAt(i);
            }
        }

        return answer.toString();

    }

    public String solution2(String s) {
        StringBuilder answer = new StringBuilder();
        s = s + " ";
        int cnt = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) cnt++;
            else {
                answer.append(s.charAt(i));
                if (cnt > 1) {
                    answer.append(String.valueOf(cnt));
                    cnt = 1;
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        A20220126 a = new A20220126();
        System.out.println(a.solution(input));

    }
}
