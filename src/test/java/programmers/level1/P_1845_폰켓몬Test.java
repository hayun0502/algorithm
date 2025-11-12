package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P_1845_폰켓몬Test {

    @Test
    void testSolution_basicCases() {
        P_1845_폰켓몬 s = new P_1845_폰켓몬();

        // case 1
        int[] nums1 = {3, 1, 2, 3};
        assertEquals(2, s.solution(nums1));  // 서로 다른 종류 3개, N/2=2 → 2

        // case 2
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        assertEquals(3, s.solution(nums2));  // 서로 다른 종류 3개, N/2=3 → 3

        // case 3
        int[] nums3 = {3, 3, 3, 2, 2, 2};
        assertEquals(2, s.solution(nums3));  // 서로 다른 종류 2개, N/2=3 → 2
    }

    @Test
    void testSolution_edgeCases() {
        P_1845_폰켓몬 s = new P_1845_폰켓몬();

        // 모든 폰켓몬이 같은 종류일 때
        int[] nums4 = {1, 1, 1, 1};
        assertEquals(1, s.solution(nums4));  // 한 종류밖에 없음

        // 모든 폰켓몬이 전부 다른 종류일 때
        int[] nums5 = {1, 2, 3, 4, 5, 6};
        assertEquals(3, s.solution(nums5));  // 종류 6개, N/2=3 → 3
    }
}
