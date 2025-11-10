package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P_42748_K번째수Test {

    @Test
    void testSolution() {
        P_42748_K번째수 s = new P_42748_K번째수();

        assertArrayEquals(new int[]{5, 6, 3}, s.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}));
        assertArrayEquals(new int[]{5, 5, 5}, s.solution(new int[]{5, 5, 5, 5, 5, 5}, new int[][]{{1, 6, 1}, {2, 5, 2}, {3, 3, 1}}));
    }
}