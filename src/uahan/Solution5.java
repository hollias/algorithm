package uahan;

public class Solution5 {
    /**
     * 시작 : 12시28분
     * 종료 : 12시 37분
     * @param number
     * @return
     */
    public int solution(int number){
        int answer = 0;
        for (int i=0; i <= number; i++){
            String stNumber = String.valueOf(i);
            char[] arrNumber = stNumber.toCharArray();
            for(int j=0; j<arrNumber.length; j++){
                if(arrNumber[j] == '3' || arrNumber[j] == '6' || arrNumber[j] == '9' ){
                    answer++;
                }
            }
        }
        return answer;
    }
}
