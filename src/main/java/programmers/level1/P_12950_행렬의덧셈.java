package programmers.level1;

import java.util.Arrays;

/**
 * [Programmers - Level 1] 행렬의 덧셈
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12950
 * 풀이 날짜: 2025.11.12
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n*m)
 *
 * 행(Row)과 열(Column)의 크기를 구한 뒤,
 * 두 행렬의 같은 위치에 있는 원소를 각각 더해 새로운 행렬(answer)에 저장한다.
 *
 */
public class P_12950_행렬의덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;
        int cols = arr1[0].length;
        int[][] answer = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
