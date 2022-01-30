package array;

import java.util.ArrayList;
import java.util.Scanner;

public class A20220130_2 {
    public String solution(int a, int b){
        if(a == b){
          return "D";
        } else if((a == 1 && b == 3) || (a == 2  && b == 1)  || (a == 3 && b == 2)) {
                return "A";
        } else {
                return "B";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        for(int i = 0; i<num ; i++){
            A.add(sc.nextInt());
        }

        for(int i = 0; i<num ; i++){
            B.add(sc.nextInt());
        }

        A20220130_2 a = new A20220130_2();
        for(int i = 0 ; i < num; i++){
            System.out.println(a.solution(A.get(i),B.get(i)));
        }
    }
}
