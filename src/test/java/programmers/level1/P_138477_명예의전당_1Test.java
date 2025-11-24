package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P_138477_명예의전당_1Test {
    @Test
    void testSolution_basicCases() {
        P_138477_명예의전당_1 s = new P_138477_명예의전당_1();

        assertArrayEquals(new int[]{10, 10, 10, 20, 20, 100, 100}, s.solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
        assertArrayEquals(new int[]{0, 0, 0, 0, 20, 40, 70, 70, 150, 300}, s.solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
    }
}
