package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P_12939_최댓값과최솟값Test {

    @Test
    void testCase1() {
        P_12939_최댓값과최솟값 sol = new P_12939_최댓값과최솟값();
        String s = "1 2 3 4";

        assertEquals("1 4", sol.solution(s));
    }

    @Test
    void testCase2() {
        P_12939_최댓값과최솟값 sol = new P_12939_최댓값과최솟값();
        String s = "-1 -2 -3 -4";

        assertEquals("-4 -1", sol.solution(s));
    }

    @Test
    void testCase3() {
        P_12939_최댓값과최솟값 sol = new P_12939_최댓값과최솟값();
        String s = "-1 -1";

        assertEquals("-1 -1", sol.solution(s));
    }

    @Test
    void testCase4_mixed() {
        P_12939_최댓값과최솟값 sol = new P_12939_최댓값과최솟값();
        String s = "-10 0 10 20 -5";

        assertEquals("-10 20", sol.solution(s));
    }

    @Test
    void testCase5_zeroOnly() {
        P_12939_최댓값과최솟값 sol = new P_12939_최댓값과최솟값();
        String s = "0 0 0 0";

        assertEquals("0 0", sol.solution(s));
    }

    @Test
    void testCase6_largeValues() {
        P_12939_최댓값과최솟값 sol = new P_12939_최댓값과최솟값();
        String s = "1000 -999 50 23 -1000";

        assertEquals("-1000 1000", sol.solution(s));
    }
}
