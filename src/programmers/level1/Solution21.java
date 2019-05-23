package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class Solution21 {
    public int[] solution(long n) {
        String[] transN = String.valueOf(n).split("");
        int[] answer = new int[transN.length];

        for(int i=0; i <= transN.length / 2; i++){
            answer[i] = Integer.parseInt(transN[(transN.length - 1) - i]);
            answer[(transN.length - 1) - i] = Integer.parseInt(transN[i]);
        }
        return answer;
    }
}
