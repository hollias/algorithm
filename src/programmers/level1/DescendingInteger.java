package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingInteger {
    String res = "";
    public int solution(int n){
//        long answer = n;
//
//        List answerArr = new ArrayList();
//        do{
//            answerArr.add(answer%10);
//            answer = answer/10;
//        }while(answer != 0);
//
//
//        Collections.sort(answerArr);
//
//        answer = 0;
//
//        for(int i=0; i < answerArr.size(); i++){
//            answer += Integer.parseInt(answerArr.get(i).toString()) * Math.pow(10,i);
//        }


        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }
}
