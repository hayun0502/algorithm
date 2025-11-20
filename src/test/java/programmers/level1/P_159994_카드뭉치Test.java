package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_159994_카드뭉치Test {
    @Test
    void testSolution_basicCases() {
        P_159994_카드뭉치 s = new P_159994_카드뭉치();

        assertEquals("Yes", s.solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
        assertEquals("No", s.solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }
}
