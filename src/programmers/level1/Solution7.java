package programmers.level1;

public class Solution7 {
    public String solution(String s) {
        String answer = "";

//        int length = s.length();
//
//        if(length%2 == 1){
//            answer = s.substring(length/2,length/2+1);
//        }else{
//            answer = s.substring(length/2-1,length/2+1);
//        }
//        return answer;

        //정답
        return s != null ? s.substring((s.length()-1)/2,(s.length()+2)/2) : "";

    }
}
