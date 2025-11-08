package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_147355_크기가작은부분문자열Test {
    @Test
    void testSolution_basicCases() {
        P_147355_크기가작은부분문자열 s = new P_147355_크기가작은부분문자열();

        assertEquals(2, s.solution("3141592", "271"));
        assertEquals(8, s.solution("500220839878", "7"));
        assertEquals(3, s.solution("10203", "15"));
    }
}
