package programmers.level1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12931_자릿수더하기Test {
    @Test
    void testSolution_basicCases() {
        P_12931_자릿수더하기 s = new P_12931_자릿수더하기();

        // 예시 1: n = 987 -> 9 + 8 + 7 = 24
        assertEquals(24, s.solution(987));
        // 예시 2: n = 123 -> 1 + 2 + 3 = 6
        assertEquals(6, s.solution(123));
        // 예시 3: n = 9 -> 9
        assertEquals(9, s.solution(9));
        // 예시 4: n = 1000 -> 1 + 0 + 0 + 0 = 1
        assertEquals(1, s.solution(1000));
    }
}
