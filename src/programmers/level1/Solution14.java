package programmers.level1;

public class Solution14 {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i=0; i < seoul.length; i++){
            if("Kim".equals(seoul[i])) answer = "김서방은 "+i+"에 있다";
        }
        return answer;
    }
}
