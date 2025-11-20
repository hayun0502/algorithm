package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12916_문자열내p와y의개수Test {
    @Test
    void testSolution_basicCases() {
        P_12916_문자열내p와y의개수 s = new P_12916_문자열내p와y의개수();

        assertEquals(false, s.solution("apple"));
        assertEquals(true, s.solution("banana"));
        assertEquals(true, s.solution("pPoooyY"));
        assertEquals(false, s.solution("Pyy"));
    }
}
