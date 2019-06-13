package programmers.level2;

import java.util.*;

public class NumberOf124World {

    public String solution(long n) {
        String answer = "";

        List<Integer> resultList = new ArrayList<>();
        transNumber(n, resultList);

        for(int i = resultList.size() - 1 ; i >= 0; i--){
            answer = answer + resultList.get(i);
        }

        return answer;
    }

    private void transNumber(long n, List resultList){
        int[] numMap = {4,1,2};
        int floorNumber = (int) Math.floorMod(n,3);
        resultList.add(numMap[floorNumber]);

        if(n/3 >= 3){
            long returnNumbur = 0;
            if(floorNumber == 0)    transNumber((n/3)-1, resultList);
            else    transNumber((n/3), resultList);

        } else if((n-1)/3 == 0){

        } else {
            resultList.add((n-1)/3);
        }
    }
}
