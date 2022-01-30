package array;/*
* 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
* 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
* */

import java.util.ArrayList;
import java.util.Scanner;

public class A20220130_1 {
    public static int solution(ArrayList<Integer> list){
        int answer = 1;
        int max = list.get(0);
        for(int i = 1; i<list.size() ;i++){
            if(max < list.get(i)){
                answer ++;
                max = list.get(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<num; i++){
            list.add(sc.nextInt());
        }

        System.out.println(A20220130_1.solution(list));
    }

}
