class Solution {
 public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int max = 0;
        int cnt = 0;
        for(int i = 0 ; i<lottos.length;i++){
            if(lottos[i]!=0){
                for(int j = 0; j<win_nums.length;j++){
                    if(lottos[i] == win_nums[j]){
                        max++;
                    }
                }
            } else {
                cnt ++;
            }
        }

        answer[0] = (max+cnt)!=0? 7-(max+cnt):6;
        answer[1] = max!=0? 7-max : 6;
        return answer;
    }
}
