package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_86051_없는숫자더하기Test {
    @Test
    void testSolution_basicCases() {
        P_86051_없는숫자더하기 s = new P_86051_없는숫자더하기();

        assertEquals(14, s.solution(new int[]{1,2,3,4,6,7,8,0}));
        assertEquals(6, s.solution(new int[]{5,8,4,0,6,7,9}));
        assertEquals(21, s.solution(new int[]{7,8,9}));
        assertEquals(35, s.solution(new int[]{1,2,3,4}));
    }
}
