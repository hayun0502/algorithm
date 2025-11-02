package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P_12906_같은숫자는싫어Test {
    @Test
    void testSolution_basicCases() {
        P_12906_같은숫자는싫어 s = new P_12906_같은숫자는싫어();

        assertArrayEquals(new int[]{1, 3, 0, 5}, s.solution(new int[]{1, 1, 1, 3, 0, 5, 5}));
        assertArrayEquals(new int[]{1, 3, 0, 1}, s.solution(new int[]{1, 1, 3, 3, 0, 1, 1}));
        assertArrayEquals(new int[]{4, 3}, s.solution(new int[]{4, 4, 4, 3, 3}));
    }
}
