package uahan;

import java.util.Arrays;

public class Solution4 {
    /**
     * 시작 : 1시02분
     * 종료 :1시 22분
     * @param pobi
     * @param crong
     * @return
     */
    public int solution(int[] pobi, int[] crong){
        int answer = 0;

        int[] pobiResult = new int[4];
        int[] crongResult = new int[4];

        if(pobi[0] - pobi[1] != -1 || crong[0] - crong[1] != -1 ){
            answer = -1;
        }else{
            for(int i=0; i<2; i++){
                int pobiValue = pobi[i];
                int crongValue = crong[i];
                int sum = 0;
                int multi = 1;
                while(pobiValue != 0){

                    sum *= (pobiValue % 10);
                    multi *= (pobiValue % 10);
                    pobiValue /= 10;
                }

                while(crongValue != 0){

                    sum *= (crongValue % 10);
                    multi *= (crongValue % 10);
                    crongValue /= 10;
                }
                pobiResult[i] = sum;
                pobiResult[i+1] = multi;
                crongResult[i] = sum;
                crongResult[i+1] = multi;
            }

        }
        return answer;
    }

    public int solution2(int[] pobi, int[] crong){
        int answer = 0;
        if(pobi[0] - pobi[1] != -1 || crong[0] - crong[1] != -1 ){
            answer = -1;
        }else{

            //pobi 왼합
            char[] pleftChars = String.valueOf(pobi[0]).toCharArray();
            int pleftSum = 0;
            int pleftMulti = 1;
            for(char value : pleftChars){
                pleftSum += Integer.parseInt(String.valueOf(value));
                pleftMulti *= Integer.parseInt(String.valueOf(value));
            }

            //pobi 오른합
            char[] prightChars = String.valueOf(pobi[1]).toCharArray();
            int prightSum = 0;
            int prightMulti = 1;
            for(char value : prightChars){
                prightSum += Integer.parseInt(String.valueOf(value));
                prightMulti *= Integer.parseInt(String.valueOf(value));
            }

            int[] pobiScore = {pleftSum,pleftMulti,prightSum,prightMulti};
            Arrays.sort(pobiScore);

            int pobiResult = pobiScore[3];


            //crong 왼합
            char[] cleftChars = String.valueOf(crong[0]).toCharArray();
            int cleftSum = 0;
            int cleftMulti = 1;
            for(char value : cleftChars){
                cleftSum += Integer.parseInt(String.valueOf(value));
                cleftMulti *= Integer.parseInt(String.valueOf(value));
            }

            //pobi 오른합
            char[] crightChars = String.valueOf(crong[1]).toCharArray();
            int crightSum = 0;
            int crightMulti = 1;
            for(char value : crightChars){
                crightSum += Integer.parseInt(String.valueOf(value));
                crightMulti *= Integer.parseInt(String.valueOf(value));
            }

            int[] crongScore = {cleftSum,cleftMulti,crightSum,crightMulti};
            Arrays.sort(crongScore);

            int crongResult = crongScore[3];

            if(pobiResult == crongResult){
                answer = 0;
            }else if(pobiResult > crongResult){
                answer = 1;
            }else if(pobiResult < crongResult){
                answer = 2;
            }
        }
        return answer;
    }
}
