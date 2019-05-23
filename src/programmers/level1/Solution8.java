package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class Solution8 {
    public int[] solution(int []arr) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=0; i < arr.length -1; i++){
           if(arr[i] == arr[i+1]){
                arr[i] = -1;
           }
        }

        for(int i=0; i < arr.length; i++){
            if(arr[i] > -1){
                answerList.add(arr[i]);
            }
        }
        int[] answer = new int[answerList.size()];
        for(int i=0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
