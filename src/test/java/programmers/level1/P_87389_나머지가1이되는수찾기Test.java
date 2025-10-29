package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_87389_나머지가1이되는수찾기Test {
    @Test
    void testSolution_basicCases() {
        P_87389_나머지가1이되는수찾기 s = new P_87389_나머지가1이되는수찾기();

        assertEquals(3, s.solution(10));
        assertEquals(11, s.solution(12));
        assertEquals(2, s.solution(11));
        assertEquals(3, s.solution(22));
    }
}
