package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution9 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = null;

        List<Integer> answerList = new ArrayList<>();

        for (int value : arr){
            if(value % divisor == 0){
                answerList.add(value);
            }
        }

        if(answerList.isEmpty()){
            int[] temp = {-1};
            answer = temp;
        }else{
            Collections.sort(answerList);
            int[] temp = new int[answerList.size()];
            for (int i = 0; i < answerList.size(); i++){
                temp[i] = answerList.get(i);
            }
            answer = temp;

        }

        return answer;
    }
}
