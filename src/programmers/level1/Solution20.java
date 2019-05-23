package programmers.level1;

public class Solution20 {
    public int solution(int n) {
        int answer = 0;

        String transN = String.valueOf(n);

        for(int i=0; i < transN.length(); i++){
            answer += Integer.parseInt(String.valueOf(transN.charAt(i)));
        }

        return answer;
    }
}
