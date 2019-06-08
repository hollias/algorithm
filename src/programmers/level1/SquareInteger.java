package programmers.level1;

public class SquareInteger {
    public long solution(long n){

        for(long i=1;i<=Math.sqrt(n);i++) {
            if(Math.sqrt(n)==i) {

                return (i+1)*(i+1);
            }
        }
        return -1;

    }
}
