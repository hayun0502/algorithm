package programmers.level1;

import java.util.*;

/**
 * [Programmers - Level 1] K번째수
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * 풀이 날짜: 2025.11.10
 * 사용 알고리즘: Loop
 * 시간복잡도: O(c * m log m)
 *
 * copyOfRange로 주어진 구간을 잘라내고, 오름차순으로 정렬한 뒤 k번째 원소를 뽑는 방식이다.
 *
 */
public class P_42748_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0] - 1;
            int end   = commands[i][1];
            int k     = commands[i][2] - 1;

            int[] slice = Arrays.copyOfRange(array, start, end);
            Arrays.sort(slice);
            result[i] = slice[k];
        }
        return result;
    }
}
