package array;

import java.util.Scanner;

// 봉우리
public class A20220422 {

    public static int solution(int[][] arr,int num){
        int answer = 0;
        // 방향에 관한 문제는 이런식으로 배열에 넣어서 삼중 반복문을 돌리는게 코드가 간결
        // 그렇지 않으면 조건문이 많이 들어가야함
        int [] dx = {-1,0,1,0};
        int [] dy = {0,1,0,-1};

        for(int i= 0 ; i<num ; i++){
            for(int j =0; j<num; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx>=0 && nx<num && ny>=0 && ny<num && arr[nx][ny]>=arr[i][j]){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [][] arr = new int[num][num];

        for(int i= 0 ; i<num ; i++){
            for(int j =0; j<num; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(arr,num));
    }
}
