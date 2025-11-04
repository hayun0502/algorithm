package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_77884_약수의개수와덧셈Test {

    @Test
    void testSolution() {
        P_77884_약수의개수와덧셈 s = new P_77884_약수의개수와덧셈();

        assertEquals(43, s.solution(13, 17)); // 예시 1
        assertEquals(52,  s.solution(24, 27)); // 예시 2
    }
}