package programmers.level1;

import java.util.*;

/**
 * [Programmers - Level 1] 가장 가까운 같은 글자
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/142086
 * 풀이 날짜: 2025.11.07
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * 각 문자별로 마지막으로 등장한 위치를 저장하기 위해 HashMap을 사용한다.
 * 문자 s[i]가 이전에 등장한 적이 있다면 해당 인덱스까지의 거리를 계산하고, 없다면 -1을 기록한다.
 * 이후 해당 문자의 마지막 위치를 현재 인덱스로 갱신한다.
 */
public class P_142086_가장가까운같은글자 {
    public int[] solution(String s) {
        int n = s.length();
        int[] answer = new int[n];
        Map<Character, Integer> last = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            answer[i] = last.containsKey(ch) ? i - last.get(ch) : -1;
            last.put(ch, i);
        }
        return answer;
    }
}
