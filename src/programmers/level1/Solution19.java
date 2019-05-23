package programmers.level1;

public class Solution19 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ",-1);

        for(String str : arr){
            String tranStr = "";
            for(int i=0; i < str.length(); i++){
                if(i%2 == 0){
                    tranStr += str.substring(i,i+1).toUpperCase();
                }else{
                    tranStr += str.substring(i,i+1).toLowerCase();
                }
            }

            answer += tranStr + " ";
        }

        answer = answer.substring(0,answer.length()-1);

        return answer;
    }
}
