package programmers.level1;

import java.util.*;

public class Solution4 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];


//        for(int i=0; i < commands.length; i++){
//            List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
//
//            List newList = new ArrayList();
//            for (int j = commands[i][0]-1; j < commands[i][1]; j++){
//                newList.add(list.get(j));
//            }
//            Collections.sort(newList);
//            answer[i] = (int) newList.get(commands[i][2]-1);
//        }

        //정답
        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
