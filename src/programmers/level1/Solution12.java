package programmers.level1;

public class Solution12 {
    public String solution(String s) {
        String answer = "";

        StringBuffer buf = new StringBuffer(s);
        buf.reverse();


        answer = buf.toString();
        return answer;
    }
}
