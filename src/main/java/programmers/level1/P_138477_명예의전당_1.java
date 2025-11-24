package programmers.level1;

import java.util.PriorityQueue;

/**
 * [Programmers - Level 1] 명예의 전당(1)
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/138477
 * 풀이 날짜: 2025.11.24
 * 사용 알고리즘: Loop, PriorityQueue
 * 시간복잡도: O(N log k)
 *
 * priorityQueue(min-heap)을 사용해 '현재까지의 점수 중 상위 k개'만 유지한다.
 * 새로운 점수가 들어오면 추가하고, k명을 초과할 경우 최솟값을 제거한다.
 * 이후 PQ의 peek() 값이 해당 날짜의 발표 점수가 된다.
 *
 *
 */
public class P_138477_명예의전당_1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++){
            pq.add(score[i]);

            if(pq.size() > k){
                pq.poll();
            }

            answer[i] = pq.peek();
        }
        return answer;
    }
}
