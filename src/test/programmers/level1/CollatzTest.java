package test.programmers.level1;

import org.junit.Test;
import programmers.level1.Collatz;

import static org.junit.Assert.*;

public class CollatzTest extends Collatz {
    @Test
    public void testCollatz(){
        Collatz collatz = new Collatz();
        assertEquals(collatz.solution(626331),-1);
    }
}