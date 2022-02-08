package array;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class A20220208 {

    public int solution(int[] array){
        int answer = 0;
        int temp = 0;
        for(int i = 0 ; i<array.length;i++){
            if((array[i] == 1)){
                temp++;
                answer += temp;
            } else {
                temp = 0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int [num];

        for(int i = 0 ; i< num ; i++){
            array[i] = sc.nextInt();
        }

        A20220208 a = new A20220208();
        System.out.println(a.solution(array));

    }

}
