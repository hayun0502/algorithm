package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12928_약수의합Test {
    @Test
    void testSolution_basicCases() {
        P_12928_약수의합 s = new P_12928_약수의합();

        assertEquals(56, s.solution(28));
        assertEquals(12, s.solution(6));
    }
}
