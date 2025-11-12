package programmers.level1;

import java.util.*;

/**
 * [Programmers - Level 1] 폰켓몬
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/1845
 * 풀이 날짜: 2025.11.12
 * 사용 알고리즘: Loop, HashSet
 * 시간복잡도: O(n)
 *
 * 1. 폰켓몬의 종류가 중복되므로 HashSet을 이용해 중복을 제거한다.
 * 2. 선택할 수 있는 폰켓몬 수(N/2)와 종류 수를 비교하여 더 작은 값을 반환한다.
 *
 */
public class P_1845_폰켓몬 {
    public int solution(int[] nums) {
        // 1. 폰켓몬 종류 중복 제거 (HashSet 사용)
        Set<Integer> kinds = new HashSet<>();
        for (int n : nums) {
            kinds.add(n);
        }

        // 2. 가질 수 있는 최대 마릿수 (N/2)
        int canPick = nums.length / 2;

        // 3. 서로 다른 종류 수와 비교 -> 작은 쪽이 정답
        return Math.min(kinds.size(), canPick);
    }
}
