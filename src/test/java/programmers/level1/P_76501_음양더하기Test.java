package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_76501_음양더하기Test {

    @Test
    void testSolution() {
        P_76501_음양더하기 s = new P_76501_음양더하기();

        assertEquals(9, s.solution(new int[]{4,7,12}, new boolean[]{true,false,true}));
        assertEquals(0,  s.solution(new int[]{1,2,3}, new boolean[]{false,false,true}));
        assertEquals(6,  s.solution(new int[]{5,6,7}, new boolean[]{true,false,true}));
    }
}