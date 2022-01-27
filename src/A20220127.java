import java.util.ArrayList;
import java.util.Scanner;

public class A20220127 {

    public String solution(String input, int num){
        String answer = "";
        input = input.replace("#","1").replace("*","0");
        ArrayList<Integer> list = new ArrayList<>();
        String temp = "";
        for(int i = 0; i<input.length();i++){
            temp += input.charAt(i);
            if((i+1)%7==0){
                list.add(Integer.valueOf(temp,2));
                temp = "";
            }
        }
        for(int x : list){
            answer += (char)x;
        }
        return answer;
    }

    public String solution2(int n, String s){
        StringBuilder answer = new StringBuilder();
        for(int i = 0 ; i<n ;i++){
            String tmp = s.substring(0,7).replace("#","1").replace("*","0");
            s = s.substring(7);
            int num = Integer.parseInt(tmp,2);
            answer.append((char) num);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String input = sc.next();

        A20220127 a = new A20220127();
        System.out.println(a.solution(input,x));

    }
}
