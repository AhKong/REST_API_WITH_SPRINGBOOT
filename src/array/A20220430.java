package array;

import java.util.Scanner;

// 4월의 마지막 알고리듬듬듬
// 12. 멘토
public class A20220430 {

    public static int solution(int[][] arr ,int n, int m){
        int answer=0;
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=n; j++){ // 멘토가 될 수 있는 경우의 수 n*n 조회 (본인 포함)
                int cnt = 0;
                for(int k = 0; k<m ;k++){ // i와 j의 m번의 시험 결과 조회
                    int pi =0, pj =0;
                    for(int s= 0; s<n ;s++){ // m*s 번의 시험 결과 조회
                        if(arr[k][s]==i){ // k번째 시험의 s등이 i 라면
                            pi = s; // i는 k 번째 시험에서 (s+1)등임
                        }

                        if (arr[k][s]==j){ // k번재 시험의 s등이 j라면
                            pj = s; // j는 k번째 시험에서 (s+1)등임
                        }
                    }
                    if(pi<pj){ // m번째 시험에서 i의 등수가 j의 등수보다 낮은 경우
                        cnt++;
                    }
                }
                if(cnt==m){ // 모든 시험에서 i의 등수가 j의 등수보다 높다면
                    answer++; // 경우의 수 증가
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 학생수
        int m = sc.nextInt(); // 시험수
        int[][] arr = new int[m][n];

        for(int i=0; i<m;i++){
            for(int j =0 ; j<n ;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arr,n,m));
    }

}
