package test.programmers.level1;

import org.junit.Test;
import programmers.level1.DescendingInteger;

import static org.junit.Assert.assertEquals;

public class DescendingIntegerTest{
    @Test
    public void testSolution(){
        DescendingInteger descendingInteger = new DescendingInteger();
        long descendedData = descendingInteger.solution(118372);
        assertEquals(descendedData, 873211);

    }

}