package test.programmers.level1;

import org.junit.Test;
import programmers.level1.OddEven;

import static org.junit.Assert.*;

public class OddEvenTest extends OddEven {

    @Test
    public void testOddEven(){
        OddEven oddEven = new OddEven();
        assertEquals(oddEven.solution(-1), "Odd");

    }
}