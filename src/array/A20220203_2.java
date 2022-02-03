package array;

import java.util.ArrayList;
import java.util.Scanner;

/*
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
*/
public class A20220203_2 {

    public int solution(int num){
        int answer = 0;
        boolean flag = false;
        for(int i =2 ; i<num ; i++){
            if(num%i==0){
                flag = true;
                break;
            }
        }
        if(!flag){
            answer = num;
        }
        return  answer;
    }

    public boolean isPrime(int num){
        if(num == 1){
            return false;
        }

        for(int i=2 ; i<num ; i++){
            if(num%i==0){
               return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution2(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp>0){
                int t = tmp % 10;
                res = res*10+t;
                tmp = tmp / 10;
            }
           if(isPrime(res)){
               answer.add(res);
           }
        }
        return  answer;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        A20220203_2 a = new A20220203_2();
//        for(int i=0 ; i<num; i++){
//            StringBuilder sb = new StringBuilder(sc.next());
//            int b = Integer.parseInt(sb.reverse().toString());
//            int c = a.solution(b);
//            if(c !=0 && b != 1){
//                System.out.print(c + " ");
//            }
//        }

        int[] arr = new int[num];
        for(int i = 0 ; i<num ; i++){
            arr[i]=sc.nextInt();
        }
        for(int x : a.solution2(arr)){
            System.out.printf(x+" ");
        }


    }

}
