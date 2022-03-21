package array;

//N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.

import java.util.Scanner;

//같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
public class A20220321 {

    public void solution(int[] scores){
        int[] result = new int[scores.length];

        int rank = 0;
        int len = result.length;
        int old = 1;

        for(int i = 0; i < len; i++) {
            int max_score = i ;
            for(int j = 0 ; j < len; j++) {
                if(scores[j] > scores[max_score]) {
                    max_score = j;
                }
            }
            if(old != scores[max_score]){
                rank =  i+1;
            }
            result[max_score] = rank;
            old = scores[max_score];
            scores[max_score] = -99;
        }

        for (int i : result){
            System.out.print(i +" ");
        }
    }

    public void solution2(int[] arr){
        int len = arr.length;
        int [] answer = new int[len];
        int cnt = 1;
        for(int i = 0 ; i< len; i++){
            for(int j = 0 ; j <len ; j++){
                if(arr[j]>arr[i]){
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        for (int i : answer){
            System.out.print(i +" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[] scores = new int[num];
        for(int i = 0 ; i<num ; i++){
            scores[i] = sc.nextInt();
        }

        A20220321 a = new A20220321();
        a.solution(scores);
    }
}
