package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12925_문자열을정수로바꾸기Test {
    @Test
    void testSolution_basicCases() {
        P_12925_문자열을정수로바꾸기 s = new P_12925_문자열을정수로바꾸기();

        assertEquals(-1234, s.solution("-1234"));
        assertEquals(1234, s.solution("1234"));
        assertEquals(-897, s.solution("-897"));
        assertEquals(897, s.solution("+897"));
    }
}
