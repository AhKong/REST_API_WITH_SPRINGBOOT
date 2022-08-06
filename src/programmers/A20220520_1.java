import java.util.*;
class Solution {
    public List<String> solution(String[] record) {
      Map<String,String> map = new HashMap<>();

        for (String s : record) {
            String[] temp = s.split(" ");
            String type = temp[0];
            String uid = temp[1];

            if (!type.equals("Leave")) {
                String nickName = temp[2];
                map.put(uid, nickName);
            }
        }
       List<String> answer = new ArrayList<>();
        for(int i = 0 ; i<record.length ;i ++){
            String[] temp = record[i].split(" ");
            String type = temp[0];
            String uid = temp[1];
            if(!type.equals("Change")){
                String nickName = map.get(uid);
                String message = nickName+"님이 ";
                if(type.equals("Enter")){
                    message += "들어왔습니다.";
                } else if(type.equals("Leave")) {
                    message += "나갔습니다.";
                }
              answer.add(message);
            }
        }

       return answer;
    }
}
