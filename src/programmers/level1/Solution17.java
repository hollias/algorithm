package programmers.level1;

public class Solution17 {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        char[] transArr = new char[s.length()];

        int i=0;
        for(char c : arr){
            if(c == 32) {
                transArr[i] = ' ';
                i++;
                continue;
            }

            int a = c;
            if(c > 96){
                a = 97 + (a + n) % 97 % 26;
            }else if(c > 64){
                a = 65 + (a + n) % 65 % 26;
            }
            transArr[i] = (char) a;
            i++;
        }

        for(char c : transArr){
            answer += c;
        }

        return answer;
    }
}
