package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12922_수박수박수박수박수박수Test {
    @Test
    void testSolution_basicCases() {
        P_12922_수박수박수박수박수박수 s = new P_12922_수박수박수박수박수박수();

        assertEquals("수박수", s.solution(3));
        assertEquals("수박수박", s.solution(4));
        assertEquals("수박수박수", s.solution(5));
        assertEquals("수박수박수박", s.solution(6));
    }
}
