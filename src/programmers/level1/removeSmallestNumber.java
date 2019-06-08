package programmers.level1;

import java.util.Arrays;

public class removeSmallestNumber {
    public int[] solution(int[] arr){
        int[] answer = {};
        int smallestNumber;

        if(arr.length == 1){
            int[] temp = {-1};
        }else{
            Arrays.sort(arr);
            smallestNumber = arr[0];

        }

        return answer;
    }
}
