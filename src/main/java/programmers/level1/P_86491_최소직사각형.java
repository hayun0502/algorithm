package programmers.level1;

/**
 * [Programmers - Level 1] 최소직사각형
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 풀이 날짜: 2025.11.11
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * 명함은 가로·세로를 자유롭게 회전해 넣을 수 있기 때문에,
 * 각 명함마다 더 긴 변을 가로, 더 짧은 변을 세로로 통일시킨다.
 * 이렇게 하면 지갑 전체 크기를 결정하는 두 최댓값이 최소 조합이 된다.
 *
 * 그 후 가로 값들 중 최댓값과 세로 값들 중 최댓값을 곱하면
 * 모든 명함을 수납할 수 있는 최소 직사각형 크기가 된다.
 *
 */
public class P_86491_최소직사각형 {
    public int solution(int[][] sizes) {
        int wmax = 0;
        int hmax = 0;

        for (int i = 0; i < sizes.length; i++) {
            int w = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);

            wmax = Math.max(wmax, w);
            hmax = Math.max(hmax, h);
        }

        return wmax * hmax;
    }
}
