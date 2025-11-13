package programmers.level1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class P_12915_문자열내마음대로정렬하기Test {

    @Test
    void testSolution_basicCase() {
        P_12915_문자열내마음대로정렬하기 sol = new P_12915_문자열내마음대로정렬하기();

        String[] input = {"sun", "bed", "car"};
        String[] expected = {"car", "bed", "sun"};

        String[] result = sol.solution(input, 1);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSolution_sameIndexChar() {
        P_12915_문자열내마음대로정렬하기 sol = new P_12915_문자열내마음대로정렬하기();

        String[] input = {"abce", "abcd", "cdx"};
        String[] expected = {"abcd", "abce", "cdx"};

        String[] result = sol.solution(input, 2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSolution_sameCharDifferentOrder() {
        P_12915_문자열내마음대로정렬하기 sol = new P_12915_문자열내마음대로정렬하기();

        String[] input = {"apple", "angle", "alpha"};
        // n=0이면 모두 'a'니까 사전순 정렬
        String[] expected = {"alpha", "angle", "apple"};

        String[] result = sol.solution(input, 0);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSolution_singleElement() {
        P_12915_문자열내마음대로정렬하기 sol = new P_12915_문자열내마음대로정렬하기();

        String[] input = {"hello"};
        String[] expected = {"hello"};

        String[] result = sol.solution(input, 2);

        assertArrayEquals(expected, result);
    }

    @Test
    void testSolution_allSame() {
        P_12915_문자열내마음대로정렬하기 sol = new P_12915_문자열내마음대로정렬하기();

        String[] input = {"aaa", "aaa", "aaa"};
        String[] expected = {"aaa", "aaa", "aaa"};

        String[] result = sol.solution(input, 1);

        assertArrayEquals(expected, result);
    }
}
