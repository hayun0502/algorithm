package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12917_문자열내림차순으로배치하기Test {
    @Test
    void testSolution_basicCases() {
        P_12917_문자열내림차순으로배치하기 s = new P_12917_문자열내림차순으로배치하기();

        assertEquals("ZOKGF", s.solution("ZOFGK"));
        assertEquals("gfedcbZ", s.solution("Zbcdefg"));
    }
}
