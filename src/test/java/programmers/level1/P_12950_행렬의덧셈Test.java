package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P_12950_행렬의덧셈Test {

    @Test
    void testSolution_basicCases() {
        P_12950_행렬의덧셈 s = new P_12950_행렬의덧셈();

        // case 1
        int[][] arr1_1 = {{1, 2}, {2, 3}};
        int[][] arr2_1 = {{3, 4}, {5, 6}};
        int[][] expected_1 = {{4, 6}, {7, 9}};
        assertArrayEquals(expected_1, s.solution(arr1_1, arr2_1));

        // case 2
        int[][] arr1_2 = {{1}, {2}};
        int[][] arr2_2 = {{3}, {4}};
        int[][] expected_2 = {{4}, {6}};
        assertArrayEquals(expected_2, s.solution(arr1_2, arr2_2));

        // case 3
        int[][] arr1_3 = {{5, 5}, {10, 10}};
        int[][] arr2_3 = {{1, 1}, {2, 2}};
        int[][] expected_3 = {{6, 6}, {12, 12}};
        assertArrayEquals(expected_3, s.solution(arr1_3, arr2_3));
    }
}
