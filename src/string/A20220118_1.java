package string;

import java.util.Scanner;

/*
* 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분됩니다
* */
public class A20220118_1 {

    public String solution(String input){
        System.out.println(input);
        String answer = "";
        String[] list = input.split(" ");
        int maxLength = Integer.MIN_VALUE;
        // 내가 푼 방법
        for(String word : list){
            System.out.println(word);
            if(maxLength < word.length()){
                maxLength = word.length();
                answer = word;
            }
        }

        //강의 풀이 방법
        int pos ;
        while((pos=input.indexOf(' '))!=-1){
            String temp = input.substring(0,pos);
            int length = temp.length();
            if(maxLength < length){
                maxLength = length;
                answer = temp;
            }

            input = input.substring(pos+1);
        }

        if(input.length() > maxLength){
            answer = input;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        A20220118_1 a = new A20220118_1();
        System.out.print(a.solution(input1));

    }
}
