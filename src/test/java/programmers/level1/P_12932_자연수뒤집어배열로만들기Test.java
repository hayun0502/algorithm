package programmers.level1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P_12932_자연수뒤집어배열로만들기Test {

    @Test
    void testSolution() {
        P_12932_자연수뒤집어배열로만들기 s = new P_12932_자연수뒤집어배열로만들기();
        assertArrayEquals(new int[]{5,4,3,2,1}, s.solution(12345));
        assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,8,9}, s.solution(9876543210L));
    }
}