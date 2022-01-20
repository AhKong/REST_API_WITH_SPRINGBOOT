/*
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
*/

import java.util.Scanner;

public class A20220120 {

    public String solution(String input){
        String answer = "YES";
        int lt = 0 , rt = input.length()-1;
        char[] charArr = input.toCharArray();
        input = input.toUpperCase();
        while(lt<rt){
            if(charArr[lt] != charArr[rt]){
                return "No";
            }
            lt++;
            rt--;
        }
        return answer;
    }

    public String solution2(String input){
        String answer ="YES";
        String tmp = new StringBuilder(input).reverse().toString();
        if(!input.equalsIgnoreCase(tmp)){
            answer = "NO";
        }

        return answer;
    }

    public String solution3(String input){
        input = input.toUpperCase();
        int length  = input.length();
        for(int i = 0 ; i<(length/2);i++){
            if(input.charAt(i)!=input.charAt(length-1-i)){
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        A20220120 a = new A20220120();
        System.out.println(a.solution2(input));
    }
}
