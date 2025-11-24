package programmers.level2;

import java.util.PriorityQueue;

/**
 * [Programmers - Level 2] 더 맵게
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/42626
 * 풀이 날짜: 2025.11.24
 * 사용 알고리즘: Loop, PriorityQueue
 * 시간복잡도: O(n log n)
 *
 * 가장 낮은 스코빌 지수가 K 이상이 될 때까지
 * 두 개의 가장 안 매운 음식을 섞어서 다시 PriorityQueue에 넣는다.
 * 섞을 음식이 2개 미만인데도 K 이상을 만들지 못할 경우 -1을 반환한다.
 *
 */
public class P_42626_더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville){
            pq.add(s);
        }

        while (!pq.isEmpty() && pq.peek() < K) {
            // 여기서 재료 체크
            if (pq.size() < 2) {
                return -1;
            }
            int min1 = pq.poll();
            int min2 = pq.poll();
            int result = min1 + (min2 * 2);
            pq.add(result);
            answer++;
        }

        return answer;
    }
}
