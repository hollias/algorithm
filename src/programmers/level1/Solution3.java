package programmers.level1;

import java.util.*;

public class Solution3 {
    public int[] solution(int[] answers) {

        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Map<Integer,Integer> map = new HashMap();

        map.put(1,0);
        map.put(2,0);
        map.put(3,0);

        for (int i = 0; i < answers.length; i++){
            if (answers[i] == student1[i%student1.length]){
                map.put(1,map.get(1) + 1);
            }
            if (answers[i] == student2[i%student2.length]){
                map.put(2,map.get(2) + 1);
            }
            if (answers[i] == student3[i%student3.length]){
                map.put(3,map.get(3) + 1);
            }
        }

        List<Integer> returnValue = new ArrayList<>();
        int maxValueInMap=(Collections.max(map.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                returnValue.add(entry.getKey());
            }
        }

        Collections.sort(returnValue);

        int[] result = new int[returnValue.size()];

        for(int i = 0; i< returnValue.size(); i++){
            result[i] = returnValue.get(i);
        }
        return returnValue.stream().mapToInt(i->i.intValue()).toArray();
    }
}
