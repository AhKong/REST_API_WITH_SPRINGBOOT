package array;

import java.util.Scanner;

// 임시 반장 구하기.
public class A20220424 {

    public static int solution(int[][] arr,int n){
        int answer = 0;
        int max = 0;

        for(int i = 0 ; i<n; i++){
            int temp = 0;
            for(int j =0 ; j<n; j++){
                for(int k=0; k<5 ;k++){
                    if(arr[i][k] == arr[j][k]){
                        temp++;
                        break;
                    }
                }
            }
            if(max < temp){
                answer = i+1;
                max = temp;
            }
        }

        return answer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][5]; // 5학년까지 몇반인지 담아야 하기 때문에 n,n으로 초기화 하면 런타임 에러 발생

        for(int i=0; i<n; i++){
            for(int j=0 ; j<5; j++){ // i의 j학년 반 정보 배열에 저
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr,n));
    }
}
