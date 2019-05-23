package programmers.level1;

public class Solution16 {
    public String solution(int n) {
        String answer = "";
        String[] arr = {"박","수"};

        for(int i=1; i <= n; i++){
            answer += arr[i%2];
        }

        return answer;
    }
}
