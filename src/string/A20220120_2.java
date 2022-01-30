package string;

import java.util.Scanner;

public class A20220120_2 {

    public int solution (String input){
        input = input.replaceAll("[^0-9]","");
        if(input.charAt(0)=='0'){
            input = input.substring(1);
        }
        return Integer.parseInt(input);
    }

    public int solution2(String s){
        int answer = 0;
        for(char x : s.toCharArray()){
            if(x>48 && x<=57) {
                answer = answer * 10 +(x-48);
            }
        }
        return answer;
    }

    public int solution3(String s){
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)){
                answer +=x;
            }
        }
        return Integer.parseInt(answer); // 이게앞에 0 빼고 자연수로 파싱
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        A20220120_2  a = new A20220120_2();
       System.out.println(a.solution(input));
    }
}
