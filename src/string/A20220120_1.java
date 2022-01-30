package string;

import java.util.Scanner;

public class A20220120_1 {

    public  String solution(String input){
        String answer = "YES";
        input = input.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(input).reverse().toString();
        if(!tmp.equals(input)){
            answer ="NO";
        }
        return answer;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        A20220120_1 a = new A20220120_1();
        System.out.println(a.solution(input));
    }
}
