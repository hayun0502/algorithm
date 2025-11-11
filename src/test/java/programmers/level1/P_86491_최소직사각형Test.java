package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_86491_최소직사각형Test {
    @Test
    void testSolution_basicCases() {
        P_86491_최소직사각형 s = new P_86491_최소직사각형();

        assertEquals(4000,
                s.solution(new int[][]{
                        {60, 50}, {30, 70}, {60, 30}, {80, 40}
                })
        );

        assertEquals(120,
                s.solution(new int[][]{
                        {10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}
                })
        );

        assertEquals(133,
                s.solution(new int[][]{
                        {14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}
                })
        );
    }
}
