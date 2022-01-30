package string;

import java.util.Scanner;

// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
public class A20220118 {

    public String solution(String input){

        String answer = "";
        for(char t : input.toCharArray()){
            answer += Character.isUpperCase(t) ? Character.toLowerCase(t) :Character.toUpperCase(t);
        }
//        // 대문자는 65~122
//        for(char t : input.toCharArray()){
//            answer += (t>=65 && t<=122) ? (char)t-32 : (t+32);
//        }햣
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        A20220118 a = new A20220118();
        System.out.print(a.solution(input1));

    }

}
