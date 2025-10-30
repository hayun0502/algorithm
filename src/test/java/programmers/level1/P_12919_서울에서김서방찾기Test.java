package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_12919_서울에서김서방찾기Test {
    @Test
    void testSolution_basicCases() {
        P_12919_서울에서김서방찾기 s = new P_12919_서울에서김서방찾기();

        assertEquals("김서방은 1에 있다", s.solution(new String[]{"Jane", "Kim"}));
        assertEquals("김서방은 0에 있다", s.solution(new String[]{"Kim", "Lee", "Park"}));
        assertEquals("김서방은 3에 있다", s.solution(new String[]{"Lee", "Choi", "Park", "Kim"}));
        assertEquals("김서방은 2에 있다", s.solution(new String[]{"Han", "Yoon", "Kim", "Seo"}));
    }
}
