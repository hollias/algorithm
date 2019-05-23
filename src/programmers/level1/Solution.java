package programmers.level1;

import java.util.HashMap;

/**
 * 시작 6시 45분
 * 종료 7시
 */
public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
//        //실행시간 탈락
//        for(int i=0; i<participant.length; i++){
//            for(int j=0; j < completion.length; j++){
//                if(participant[i].equals(completion[j])){
//                    participant[i] = "";
//                    completion[j] = "";
//                    break;
//                }
//            }
//        }
//
//        for(int i=0; i<participant.length; i++){
//            if(!"".equals(participant[i])){
//                answer = participant[i];
//                break;
//            }
//        }
//        System.out.println(answer);

//        //시도2 성능 탈락
//        for(int i=0; i<participant.length; i++){
//            boolean isMatching = false;
//            for(int j=0; j<completion.length; j++){
//                if(participant[i].equals(completion[j])){
//                    completion[j] = "";
//                    isMatching = true;
//                    break;
//                }
//            }
//
//            if(isMatching == false){
//                answer = participant[i];
//            }
//        }
//
//        System.out.println(answer);


        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}
