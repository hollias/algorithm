package test.programmers.level2;

import org.junit.Test;
import programmers.level2.Tower;

import java.util.Collections;

import static org.junit.Assert.*;

public class TowerTest extends Tower {
    @Test
    public void sendTowerTest(){
        int[] heights = {3,9,9,3,5,7,2};
        int[] result = {0,0,0,3,3,3,6};

        assertArrayEquals(solution(heights), result);
    }
}