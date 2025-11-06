package programmers.level1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P_176963_추억점수Test {
    @Test
    void testSolution_example1() {
        P_176963_추억점수 s = new P_176963_추억점수();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };

        int[] expected = {19, 15, 6};
        assertArrayEquals(expected, s.solution(name, yearning, photo));
    }

    @Test
    void testSolution_example2() {
        P_176963_추억점수 s = new P_176963_추억점수();

        String[] name = {"kali", "mari", "don"};
        int[] yearning = {11, 1, 55};
        String[][] photo = {
                {"kali", "mari", "don"},
                {"pony", "tom", "teddy"},
                {"con", "mona", "don"}
        };

        int[] expected = {67, 0, 55};
        assertArrayEquals(expected, s.solution(name, yearning, photo));
    }
}
