package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_81301_숫자문자열과영단어Test {
    @Test
    void testSolution_basicCases() {
        P_81301_숫자문자열과영단어 s = new P_81301_숫자문자열과영단어();

        assertEquals(1478, s.solution("one4seveneight"));
        assertEquals(234567, s.solution("23four5six7"));
        assertEquals(234567, s.solution("2three45sixseven"));
        assertEquals(123, s.solution("123"));
    }
}
