package string;

import java.util.ArrayList;
import java.util.Scanner;

//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
public class A20220125 {

    public String solution(String input, String input2){
        String answer = "";

        ArrayList<Integer> indexList = new ArrayList<>();
        char[] stringToCharArr = input.toCharArray();

        for(int i = 0; i<stringToCharArr.length;i++){
            if(String.valueOf(stringToCharArr[i]).equals(input2)){
                indexList.add(i);
            }
        }

        for(int i = 0; i < stringToCharArr.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j <indexList.size();j++){
                int temp = Math.abs(indexList.get(j)-i);
                if(temp < min){
                    min = temp;
                }
            }
            answer += min+" ";
        }
        return answer;
    }

    public int[] solution2(String input, String target){
        int[] answer = new int[input.length()];
        int p = 1000;
        char targetChar = target.charAt(0);

        // 왼쪽으로 부터 탐색
        for(int i = 0; i<input.length();i++){
            if(input.charAt(i)==targetChar){
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        for(int i = input.length()-1;i>=0;i--){
            if(input.charAt(i)==targetChar){
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();

        A20220125 a = new A20220125();
        //System.out.println(a.solution(input1,input2));

        for(int i = 0 ; i<a.solution2(input1,input2).length;i++){
            System.out.print(a.solution2(input1,input2)[i] +" ");
        }



    }
}
