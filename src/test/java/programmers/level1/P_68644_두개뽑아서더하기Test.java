package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P_68644_두개뽑아서더하기Test {
    @Test
    void testSolution_basicCases() {
        P_68644_두개뽑아서더하기 s = new P_68644_두개뽑아서더하기();

        assertArrayEquals(new int[]{2,3,4,5,6,7}, s.solution(new int[]{2,1,3,4,1}));
        assertArrayEquals(new int[]{2,5,7,9,12}, s.solution(new int[]{5,0,2,7}));
    }
}
