package com.company.A20220117;

import java.util.*;

public class Main {
// 1. 문자찾기
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(char x : str.toCharArray()){
            if(x == t) answer ++;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Main t = new Main();
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.print(t.solution(input1,input2));

    }


}