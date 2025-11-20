package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12933_정수내림차순으로배치하기Test {
    @Test
    void testSolution_basicCases() {
        P_12933_정수내림차순으로배치하기 s = new P_12933_정수내림차순으로배치하기();

        assertEquals(873211, s.solution(118372));
        assertEquals(998211, s.solution(299811));
        assertEquals(98765, s.solution(56897));
    }
}
