package programmers.level1;

public class Solution13 {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() >= 6){
            return false;
        }else if(s.length() >= 4){
            return false;
        }
        try {
            Integer.parseInt(s);
        }catch (Exception e){
            answer = false;
        }
        return answer;
    }
}
