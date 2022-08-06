package string;

import java.util.ArrayList;
import java.util.List;

// Programmers - 숫자 문자열과 영단어
public class A20220807 {
    // 내가 푼
    public int solution1(){
        String test ="one2three4";
        String[] temp = test.split("");

        String t = "";
        String answer = "";
        for(int i = 0; i<temp.length;i++){
            if(test.charAt(i) >=48 && test.charAt(i)<=57){
                answer+= temp[i];
            } else {
                t += temp[i];
                String parsingData = parsingStringToNumber(t);
                System.out.println(t);
                if(!parsingData.equals("notMatched")){
                    answer+=parsingData;
                    t="";
                }
            }
        }

        return Integer.parseInt(answer);
    }

    // 프로그래머스 replaceAll 이용한 코드
    public int solution2(String s){
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
    }

    public static String parsingStringToNumber(String number) {
        switch (number) {
            case "zero":
                return "0";
            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            default:
                return "notMatched";
        }
    }
}

