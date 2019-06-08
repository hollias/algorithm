package test.programmers.level1;

import org.junit.Test;
import programmers.level1.DescendingInteger;
import programmers.level1.SquareInteger;

import static org.junit.Assert.*;

public class SquareIntegerTest extends DescendingInteger {
    @Test
    public void testIsSquare(){
        SquareInteger sqr = new SquareInteger();
        assertEquals(sqr.solution(1), 4);

    }
}