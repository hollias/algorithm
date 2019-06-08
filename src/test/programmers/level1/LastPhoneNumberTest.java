package test.programmers.level1;

import org.junit.Test;
import programmers.level1.LastPhoneNumber;

import static org.junit.Assert.*;

public class LastPhoneNumberTest extends LastPhoneNumber {
    @Test
    public void testLastPhoneNumber(){
        LastPhoneNumber lastPhoneNumber = new LastPhoneNumber();
        assertEquals(lastPhoneNumber.solution("01099799731"), "*******9731");
    }
}