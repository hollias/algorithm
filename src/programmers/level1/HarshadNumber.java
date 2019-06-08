package programmers.level1;

public class HarshadNumber {
    public boolean solution(int x) {
        int num = x;
        int sum = 0;
        while(x !=0){
            sum += x%10;
            x /=10;
        }
        return num%sum == 0;
    }
}
