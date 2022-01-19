import java.util.ArrayList;
import java.util.Scanner;

public class A20220119 {

    public String solution(String input){
        String answer = "";
        for(int i = input.length()-1 ;i >=0 ; i--){
            answer = answer + input.charAt(i);
        }
        return answer;
    }

    public ArrayList<String> solution2(ArrayList<String> list){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : list){
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }


    public ArrayList<String> solution3(ArrayList<String> list){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : list){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt<rt){ // 직접 reverse 구현
                char temp = s[lt];
                s[lt] = s[rt];
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
         }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int count = in.nextInt();
        ArrayList<String> list  = new ArrayList<>();
        A20220119 a = new A20220119();
        for(int i = 0 ; i<count ; i++){
            String input = in.next();
            list.add(input);
            System.out.println(a.solution(input));
        }

        for(String x : a.solution2(list)){
            System.out.println(x);
        }

    }
}
