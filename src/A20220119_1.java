import java.util.Scanner;

/*
* 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고
* 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작서하시오.
*
* */
public class A20220119_1 {

    public String solution(String input){
        String answer = "";
        char [] s = input.toCharArray();
        int lt = 0 , rt = s.length-1;
        while(lt<rt){
            char ltTemp = s[lt];
            char rtTemp = s[rt];
            if(!Character.isAlphabetic(ltTemp)){
                lt++;
            } else if(!Character.isAlphabetic(rtTemp)){
                rt--;
            } else {
                s[lt] = s[rt];
                s[rt] = ltTemp;

                lt++;
                rt--;
            }

        }

        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        A20220119_1 a = new A20220119_1();
        System.out.println(a.solution(input));
    }

}
