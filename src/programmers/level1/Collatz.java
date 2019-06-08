package programmers.level1;

public class Collatz {
    int returnCount = 0;
    public int solution(long num) {
        returnCount = getCollatz(num);
        return returnCount;
    }

    private int getCollatz(long num) {
        if(num == 1) return returnCount;
        if(returnCount > 500) return -1;
        returnCount++;
        return num % 2 ==0? getCollatz(num/2) :
        getCollatz(num*3 + 1);
    }


}
