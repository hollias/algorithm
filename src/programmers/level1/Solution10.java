package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class Solution10 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char[] a = o1.toCharArray();
                char[] b = o2.toCharArray();

                if(a[n] > b[n]){
                    return 1;
                }else if(a[n] < b[n]){
                    return -1;
                }else{
                    return 0;
                }
            }
        });
        return strings;
    }

}
