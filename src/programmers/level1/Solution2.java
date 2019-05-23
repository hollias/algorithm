package programmers.level1;

import java.util.Arrays;

public class Solution2 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        System.out.println(Arrays.toString(phone_book));

        return answer;
    }
}
