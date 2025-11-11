package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12982_예산Test {
    @Test
    void testSolution_basicCases() {
        P_12982_예산 s = new P_12982_예산();

        assertEquals(3, s.solution(new int[]{1,3,2,5,4}, 9));
        assertEquals(4, s.solution(new int[]{2,2,3,3}, 10));
    }
}
