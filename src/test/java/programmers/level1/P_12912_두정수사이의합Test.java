package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12912_두정수사이의합Test {
    @Test
    void testSolution_basicCases() {
        P_12912_두정수사이의합 s = new P_12912_두정수사이의합();

        assertEquals(12, s.solution(3, 5));
        assertEquals(12, s.solution(3, 5));
    }
}
