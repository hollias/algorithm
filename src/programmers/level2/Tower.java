package programmers.level2;

/**
 * 10시 50분 시작
 * 11시 12분 종료
 */
public class Tower {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for(int i=heights.length - 1; i >= 0; i--){
            for(int j = i - 1; j >= 0 ; j --){
                if(heights[i] < heights[j] ){
                    answer[i] = j+1;
                    break;
                }
            }
        }

        return answer;
    }
}
