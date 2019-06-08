package programmers.level1;

public class LCMGCD {
    public int[] solution(int n, int m) {

        int largerNum = n > m ? n : m;
        int smallerNum = n > m ? m : n;
        int lcm = getLCM(largerNum, smallerNum);
        int gcd = smallerNum * largerNum / lcm;
        int[] answer = {lcm, gcd};
        return answer;
    }

    public int getLCM(int largerNum, int smallerNum){

        int returnNumber = 0;
        if(largerNum == smallerNum) returnNumber = smallerNum;

        if(largerNum%smallerNum == 0) returnNumber = smallerNum;
        else returnNumber = getLCM(smallerNum, largerNum%smallerNum);

        return returnNumber;
    }
}
