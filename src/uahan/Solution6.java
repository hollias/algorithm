package uahan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution6 {
    /**
     * 시작 : 6시 30분
     * 종료 : 7시20분
     * @param totalticket
     * @param logs
     * @return
     */
    public List<String> solution(int totalticket, String[] logs) throws ParseException {
        List<String> answer = new ArrayList();
        SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");

        Queue ticketingQue = new LinkedList();
        for (String log :
                logs) {

            String[] newUserInfo = log.split(" ");
            String id = newUserInfo[0];

            if("request".equals(newUserInfo[1])){
                if(ticketingQue.isEmpty()){
                    answer.add(id);
                    ticketingQue.offer(log);
                }else{
                    String insertedUser = (String) ticketingQue.element();
                    String[] insertedUserInfo = insertedUser.split(" ");

                    Date insertedDate = f.parse(insertedUserInfo[2]);
                    Date newInsertedDate = f.parse(newUserInfo[2]);

                    long diff = newInsertedDate.getTime() - insertedDate.getTime();
                    long sec = diff / 1000;

                    if(sec > 60){
                        answer.add(id);
                        ticketingQue.remove();
                        ticketingQue.offer(log);
                    }

                }
            }else if("leave".equals(newUserInfo[1])){
                ticketingQue.peek();
            }

        }
        return answer;
    }
}
