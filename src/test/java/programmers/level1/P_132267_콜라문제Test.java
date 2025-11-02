package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_132267_콜라문제Test {

    @Test
    void testSolution() {
        P_132267_콜라문제 s = new P_132267_콜라문제();

        assertEquals(19, s.solution(2, 1, 20)); // 예시 1
        assertEquals(9,  s.solution(3, 1, 20)); // 예시 2
        assertEquals(0,  s.solution(5, 3, 4));  // 교환 불가
        assertEquals(4,  s.solution(3, 1, 9));  // ✔ 3이 아니라 4
        assertEquals(15, s.solution(4, 3, 8));  // ✔ 13이 아니라 15
    }
}