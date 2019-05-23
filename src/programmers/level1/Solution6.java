package programmers.level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution6 {
    public String solution(int a, int b) throws ParseException {
        String answer = "";


        String Month = String.format("%02d", a);
        String day = String.format("%02d", b);
        String date = "2016" + Month + day ;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd") ;
        Date nDate = dateFormat.parse(date) ;

        Calendar cal = Calendar.getInstance() ;
        cal.setTime(nDate);

        int dayNum = cal.get(Calendar.DAY_OF_WEEK) ;

        switch(dayNum){
            case 1:
                answer = "SUN";
                break ;
            case 2:
                answer = "MON";
                break ;
            case 3:
                answer = "TUE";
                break ;
            case 4:
                answer = "WED";
                break ;
            case 5:
                answer = "THU";
                break ;
            case 6:
                answer = "FRI";
                break ;
            case 7:
                answer = "SAT";
                break ;

        }
        return answer;
    }
}
