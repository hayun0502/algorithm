package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_72410_신규아이디추천Test {
    @Test
    void testSolution_basicCases() {
        P_72410_신규아이디추천 s = new P_72410_신규아이디추천();

        assertEquals(	"bat.y.abcdefghi", s.solution("...!@BaT#*..y.abcdefghijklm"));
        assertEquals("z--", s.solution(	"z-+.^."));
        assertEquals("aaa", s.solution(		"=.="));
        assertEquals("123_.def", s.solution(	"123_.def"));
        assertEquals("abcdefghijklmn", s.solution(		"abcdefghijklmn.p"));

    }
}
