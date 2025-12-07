package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * [Programmers - Level 2] 귤 고르기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/138476
 * 풀이 날짜: 2025.12.07
 * 사용 알고리즘: HashMap + Greedy
 * 시간복잡도: O(n + m log m)   // m은 귤 종류 수 (최악 시 n)
 *
 * HashMap을 이용해 귤 크기별 개수를 계산한다.
 * 이후 개수(value)만 ArrayList로 추출하여 내림차순 정렬한다.
 * (많이 등장한 크기부터 선택해야 종류 수를 최소화할 수 있음 - Greedy)
 *
 * 정렬된 개수를 순서대로 k에서 차감하면서,
 * 필요한 귤 종류 개수를 카운트한다.
 * k가 0 이하가 되는 시점의 종류 수가 최종 답이다.
 *
 */
public class P_138476_귤고르기 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        // 1. hashMap을 이용하여 크기별 개수 세기
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. ArrayList를 활용하여 많은 순서대로 정렬하기
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        for (int count : list) {
            k -= count;
            answer++;
            if (k <= 0) break;
        }

        return answer;
    }
}
