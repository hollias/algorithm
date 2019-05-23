package uahan;

/**
 * 문제 1 (20분 소요)
 */
public class Solution {
    public int[] solution(int money){
        int[] units = {50000,10000,5000,1000,500,100,50,10,1};

        int[] answer =  new int[units.length];
        for (int i=0; i < units.length; i++) {
            answer[i] = money / units[i];
            money = money % units[i];
        }
        return answer;
    }

}
