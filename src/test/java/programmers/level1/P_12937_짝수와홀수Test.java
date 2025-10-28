package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12937_짝수와홀수Test {
    @Test
    void testSolution_basicCases() {
        P_12937_짝수와홀수 s = new P_12937_짝수와홀수();

        assertEquals("Odd", s.solution(3));
        assertEquals("Even", s.solution(4));
        assertEquals("Odd", s.solution(9));
        assertEquals("Even", s.solution(1000));
    }
}
