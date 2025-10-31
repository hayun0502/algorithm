package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_134240_푸드파이트대회Test {
    @Test
    void testSolution_basicCases() {
        P_134240_푸드파이트대회 s = new P_134240_푸드파이트대회();

        assertEquals("1223330333221", s.solution(new int[]{1, 3, 4, 6}));
        assertEquals("111303111", s.solution(new int[]{1, 7, 1, 2}));
    }
}
