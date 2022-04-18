    package array;

    import java.util.Scanner;

    public class A20220419 {
        public int solution(int [][] arr){
            int max = Integer.MIN_VALUE;
            int sum1=0,sum2=0,sum3=0,sum4=0;
            int n = arr.length;
            for(int i = 0 ; i < n; i++){
                sum1 = sum2 = 0;
                for(int j = 0 ; j< n; j++){
                    sum1 += arr[i][j];
                    sum2 += arr[j][i];
                }
                max = Math.max(max,sum1);
                max = Math.max(max,sum2);
                sum3 +=  arr[i][i];
                sum4 += arr[i][(arr.length-1)-i];
            }

            max = Math.max(max,sum3);
            max = Math.max(max,sum4);
            return  max;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arrayNum = sc.nextInt();

            int [][] arr = new int[arrayNum][arrayNum];
            for(int i = 0; i< arrayNum ; i++){
                for(int j = 0 ;  j<arrayNum; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            A20220419 a = new A20220419();
            System.out.println(a.solution(arr));
        }
    }
