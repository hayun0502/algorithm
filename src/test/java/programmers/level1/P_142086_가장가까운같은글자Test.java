package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P_142086_가장가까운같은글자Test {
    @Test
    void testSolution_basicCases() {
        P_142086_가장가까운같은글자 s = new P_142086_가장가까운같은글자();

        assertArrayEquals(new int[]{-1, -1, -1, 2, 2, 2}, s.solution("banana"));
        assertArrayEquals(new int[]{-1, -1, 1, -1, -1, -1}, s.solution("foobar"));
        assertArrayEquals(new int[]{-1, -1, 1, -1, -1}, s.solution("apple"));
    }
}
