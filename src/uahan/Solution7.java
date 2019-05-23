package uahan;

public class Solution7 {
    /**
     * 시작시간 : 7시30분
     * 종료시각 : 8시 00분
     * @param cryptogram
     * @return
     */
    public String solution(String cryptogram) {
        String answer = "";



        char thePreviousCharacter = 0;
        char theFollowingCharacters = 0;

        answer = cryptogram;

        boolean isErase = false;
        do {
            isErase = false;
            char[] chars = answer.toCharArray();
            for (char character : chars) {
                theFollowingCharacters = character;
                if (thePreviousCharacter == theFollowingCharacters) {
                    String eraseCharacter = theFollowingCharacters + "" + theFollowingCharacters;
                    answer = answer.replaceAll(eraseCharacter, "");
                    thePreviousCharacter = theFollowingCharacters;
                    isErase = true;

                }
                thePreviousCharacter = theFollowingCharacters;
            }

        } while (isErase);

        return answer;
    }
}
