package uahan;

public class Solution2 {
    /**
     * 시작 : 10시50분
     * 종료 : 11시 25분
     */

    public boolean solution2(int[][] lands, int[][] wells, int[] point){
        boolean answer = true;

        int landsLength = lands.length;
        int wellsLength = wells.length;

        boolean isDoubleHitLand = false;
        boolean isDoubleHitWell = false;
        for(int i=0; i<landsLength; i++){
            boolean isDoubleHitX = false;
            boolean isDoubleHitY = false;

            isDoubleHitX = lands[i][0] >= point[0] && lands[i][2] <= point[2];
            isDoubleHitY = lands[i][1] >= point[1] && lands[i][3] <= point[3];

            if(isDoubleHitX && isDoubleHitY){
                isDoubleHitLand = true;
                break;
            }
        }

        for(int i=0; i<wellsLength; i++){
            boolean isDoubleHitX = false;
            boolean isDoubleHitY = false;

            isDoubleHitX = wells[i][0] >= point[0] && wells[i][2] <= point[2];
            isDoubleHitY = wells[i][1] >= point[1] && wells[i][3] <= point[3];

            if(isDoubleHitX && isDoubleHitY){
                isDoubleHitWell = true;
                break;
            }
        }

        answer = !isDoubleHitLand && isDoubleHitWell;

        return answer;
    }
}
