package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P_42626_더맵게Test {

    @Test
    void testSolution_basicCases() {
        P_42626_더맵게 s = new P_42626_더맵게();

        assertEquals(	2, s.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }
}
