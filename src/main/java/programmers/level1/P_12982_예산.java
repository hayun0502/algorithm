package programmers.level1;

import java.util.*;

/**
 * [Programmers - Level 1] 예산
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12982
 * 풀이 날짜: 2025.11.11
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n log n)
 *
 * 제일 많은 부서에 도움을 주기 위해서는 예산이 작게 편성된 부서부터 물품을 지원한다.
 * 그러기 위해 sort()를 사용하여 배열을 오름차순으로 정렬 한 후,
 * 주어진 예산이 0이 될 때까지 count한다.
 *
 */
public class P_12982_예산 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;

        for(int i =0; i < d.length; i++){
            budget = budget - d[i];
            if(budget < 0) break;
            answer++;
        }

        return answer;
    }
}
