package twoPointersSlidingWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 3.1 두배열 합치기
// 알고리즘 문제가 두 배열 합쳐서 정렬하기 처럼 쉬운 문제가 나오면 일반적인 정렬 문제가 아니라 투포인터의 개념을 알고 있는지 확인 하기 위한 문제임
// Collection.sort 를 하라는게 아님 ^^;ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
public class A20220503{

    public static List<Integer> solution(int n ,int m , int[] a, int[] b){
        List<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 =0;
        while(p1>n && p2<m){
            while(p1<n && p2<m){
                if(a[p1]<b[p2]) answer.add(a[p1++]);
                else answer.add(b[p2++]);
            }
            while(p1<n) answer.add(a[p1++]);
            while(p2<m) answer.add(b[p2++]);
        }
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }

        int m  = sc.nextInt();
        int [] arr2 = new int[m];

        for(int i = 0 ; i <m ; i++){
            arr2[i] = sc.nextInt();
        }

        for(int x : A20220503.solution(n,m,arr1,arr2)){
            System.out.printf(x +" ");
        }
    }
}
