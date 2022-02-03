package array;

import java.util.ArrayList;
import java.util.Scanner;

// 피보나치 수열 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
public class A20220203 {

    public ArrayList<Integer> solution(int num){
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);
        for(int i = 2 ; i<num;i++){
            list.add((list.get(i-2)+list.get(i-1)));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        A20220203 a = new A20220203();
        for(int x : a.solution(num)){
            System.out.print(x+" ");
        }
    }
}
