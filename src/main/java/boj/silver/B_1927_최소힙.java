package boj.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * [Baekjoon - silver ] 최소 힙
 * 문제 링크: https://www.acmicpc.net/problem/1927
 * 풀이 날짜: 2025.11.24
 * 사용 알고리즘: Loop, PriorityQueue
 * 시간복잡도: O(n log n)
 *
 */
public class B_1927_최소힙 {
    public static void main(String[] args) throws Exception {
        // 1. BufferedReader 를 이용하여 입력값 빠르게 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2. 출력을 용이하게 하기 위하여 StringBuilder 이용하여 한번에 출력하기
        StringBuilder sb = new StringBuilder();
        // 3. x가 0일 때 가장 작은 값을 출력하기 위해 priorityQueue를 사용한다.
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine()); // N개의 정수

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            // x가 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우
            if(x == 0){
                // 배열이 비어 있는 경우인데 가장 작은 값을 출력하라고 한 경우에는 0을 출력
                if (pq.isEmpty()) sb.append(0).append('\n');
                else sb.append(pq.poll()).append('\n');
            } else { // x가 0이 아닌 자연수일 경우 추가
                pq.add(x);
            }
        }
        System.out.print(sb);
    }
}
