package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12903_가운데글자가져오기Test {
    @Test
    void testSolution_basicCases() {
        P_12903_가운데글자가져오기 s = new P_12903_가운데글자가져오기();

        assertEquals("p", s.solution("apple"));
        assertEquals("na", s.solution("banana"));
        assertEquals("o", s.solution("dog"));
        assertEquals("od", s.solution("code"));
    }
}
