package programmers.level2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P_12909_올바른괄호Test {

    @Test
    void testCase1() {
        P_12909_올바른괄호 sol = new P_12909_올바른괄호();
        String s = "()()";

        assertTrue(sol.solution(s));
    }

    @Test
    void testCase2() {
        P_12909_올바른괄호 sol = new P_12909_올바른괄호();
        String s = "(())()";

        assertTrue(sol.solution(s));
    }

    @Test
    void testCase3() {
        P_12909_올바른괄호 sol = new P_12909_올바른괄호();
        String s = "(())(";

        assertFalse(sol.solution(s));
    }

    @Test
    void testCase4() {
        P_12909_올바른괄호 sol = new P_12909_올바른괄호();
        String s = ")()(";

        assertFalse(sol.solution(s));  // 닫는 괄호 먼저
    }

    @Test
    void testCase5_singleOpen() {
        P_12909_올바른괄호 sol = new P_12909_올바른괄호();
        String s = "(";

        assertFalse(sol.solution(s)); // 스택 남음
    }

    @Test
    void testCase6_singleClose() {
        P_12909_올바른괄호 sol = new P_12909_올바른괄호();
        String s = ")";

        assertFalse(sol.solution(s)); // pop 불가
    }

    @Test
    void testCase7_emptyString() {
        P_12909_올바른괄호 sol = new P_12909_올바른괄호();
        String s = "";

        assertTrue(sol.solution(s));  // 빈 문자열은 정상
    }

    @Test
    void testCase8_longTrue() {
        P_12909_올바른괄호 sol = new P_12909_올바른괄호();
        String s = "()()()()()((()))";

        assertTrue(sol.solution(s));
    }

    @Test
    void testCase9_longFalse() {
        P_12909_올바른괄호 sol = new P_12909_올바른괄호();
        String s = "((()())))))";

        assertFalse(sol.solution(s));
    }
}
