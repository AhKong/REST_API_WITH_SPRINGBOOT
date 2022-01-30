import java.util.ArrayList;
import java.util.Scanner;

/*
* N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
(첫 번째 수는 무조건 출력한다)

 * */
public class A20220130 {

    public String solution(ArrayList<Integer> integerArrayList){
        String answer = "";
        answer += integerArrayList.get(0)+" ";
        for(int i = 1; i<integerArrayList.size(); i++){
            if(integerArrayList.get(i-1)<integerArrayList.get(i)){
                answer += integerArrayList.get(i)+" ";
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for(int i = 0; i <num; i++){
            integerArrayList.add(sc.nextInt());
        }
        A20220130 a = new A20220130();
        System.out.println(a.solution(integerArrayList));
    }

}
