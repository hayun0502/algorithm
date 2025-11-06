package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12918_문자열다루기기본Test {
    @Test
    void testSolution_basicCases() {
        P_12918_문자열다루기기본 s = new P_12918_문자열다루기기본();

        assertEquals(false, s.solution("a234"));
        assertEquals(true, s.solution("1234"));
        assertEquals(false, s.solution("123456789"));
        assertEquals(false, s.solution("1000a"));
    }
}
