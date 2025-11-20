package programmers.level1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12930_이상한문자만들기Test {
    @Test
    void testSolution_basicCases() {
        P_12930_이상한문자만들기 s = new P_12930_이상한문자만들기();

        assertEquals("TrY HeLlO WoRlD", s.solution("try hello world"));
    }
}
