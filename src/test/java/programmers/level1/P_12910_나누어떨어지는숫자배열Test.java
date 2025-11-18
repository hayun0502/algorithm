package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P_12910_나누어떨어지는숫자배열Test {
    @Test
    void testSolution_basicCases() {
        P_12910_나누어떨어지는숫자배열 s = new P_12910_나누어떨어지는숫자배열();

        assertArrayEquals(new int[]{5, 10}, s.solution(new int[]{5, 9, 7, 10}, 5));
        assertArrayEquals(new int[]{1, 2, 3, 36}, s.solution(new int[]{2, 36, 1, 3}, 1));
        assertArrayEquals(new int[]{-1}, s.solution(new int[]{3,2,6}, 10));
    }
}
