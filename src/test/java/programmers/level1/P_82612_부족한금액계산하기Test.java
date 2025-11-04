package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_82612_부족한금액계산하기Test {

    @Test
    void testSolution() {
        P_82612_부족한금액계산하기 s = new P_82612_부족한금액계산하기();

        assertEquals(10, s.solution(3, 20, 4));
        assertEquals(25,  s.solution(5, 50, 5));
        assertEquals(0,  s.solution(10, 1000, 10));
    }
}