package programmers.level1;

public class Solution11 {
    public boolean solution(String s) {
        boolean answer = true;

        s = s.toUpperCase();

        int p = 0;
        int y = 0;
        char[] s2 = s.toCharArray();
        for(int i=0; i < s.length(); i++){
            if(s2[i] == 'P') p++;
            if(s2[i] == 'Y') y++;
        }

        answer = p==y?true:false;

        return answer;
    }
}
