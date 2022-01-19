import java.util.Scanner;

/*
* 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
*/
public class A20220119_2 {

    public String solution(String input){
        String answer = "";
        for(int i = 0 ; i<input.length();i++){
            if(input.indexOf(input.charAt(i)) == i){
                answer += input.charAt(i);
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A20220119_2 a = new A20220119_2();
        String input = sc.next();

        System.out.println(a.solution(input));
    }
}
