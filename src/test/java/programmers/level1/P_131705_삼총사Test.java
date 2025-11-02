package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_131705_삼총사Test {

    @Test
    void testSolution() {
        P_131705_삼총사 s = new P_131705_삼총사();

        assertEquals(2, s.solution(new int[]{-2, 3, 0, 2, -5}));
        assertEquals(5, s.solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
        assertEquals(0, s.solution(new int[]{-1, 1, -1, 1}));
    }
}