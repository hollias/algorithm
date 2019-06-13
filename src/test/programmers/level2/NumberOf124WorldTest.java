package test.programmers.level2;

import org.junit.Test;
import programmers.level2.NumberOf124World;

import static org.junit.Assert.*;

public class NumberOf124WorldTest extends NumberOf124World {
    @Test
    public void test() {
         assertEquals(solution(15), "1112");
    }
}
