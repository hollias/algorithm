package uahan;

public class Solution3 {
    /**
     * 시작 : 12시40분
     * 종료 : 1시
     * @param word
     * @return
     */
    public String solution(String word){
        String result = "";

        char[] chars = word.toCharArray();
        char[] conversionChars = new char[chars.length];
        for(int i=0; i<chars.length; i++){
            if(chars[i] >=65 && chars[i] <= 90){
                int ascValue = 155 - chars[i];
                char conversionChar = (char) ascValue;
                conversionChars[i] = conversionChar;
            }else if(chars[i] >=97 && chars[i] <= 122){
                int ascValue = 219 - chars[i];
                char conversionChar = (char) ascValue;
                conversionChars[i] = conversionChar;
            }
        }

        result = String.valueOf(conversionChars);
        return result;
    }
}
