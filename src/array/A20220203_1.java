package array;

import java.util.ArrayList;
import java.util.Scanner;

//소수
public class A20220203_1 {

    // 시간 제한 걸린 답변
    public int solution(int num){
        int answer = 0;
        for(int i = 2 ; i<= num ; i++){
            boolean flag = false;
            for(int j = 2 ; j <=num ; j++){
                if(i%j==0 && i !=j){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                answer++;
            }
        }
        return answer;
    }

    // 에라토스테네스 체 가 가장 빠름
    public int solution2(int num){
        int answer = 0;
        int[] array = new int[num+1];
        for(int i = 2 ; i<=num; i++){
            if(array[i] == 0){
                answer ++;
                for(int j=i; j<=num ; j=j+i){ // i의 배수
                   array[j] = 1;
                }
            }
        }
        return answer;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        A20220203_1 a = new A20220203_1();
        System.out.println(a.solution2(num));
    }
}
