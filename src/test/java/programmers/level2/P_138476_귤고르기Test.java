package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P_138476_귤고르기Test {

    @Test
    void testSolution_basicCases() {
        P_138476_귤고르기 s = new P_138476_귤고르기();

        // 예시 1
        assertEquals(3, s.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));

        // 예시 2
        assertEquals(2, s.solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));

        // 예시 3
        assertEquals(1, s.solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }
}
