package programmers.level1;

import java.util.*;

/**
 * [Programmers - Level 1] 카드 뭉치
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/159994
 * 풀이 날짜: 2025.11.20
 * 사용 알고리즘: Queue, Loop
 * 시간복잡도: O(n)
 *
 * 카드 뭉치의 순서를 변경할 수 없고, 앞에서부터만 카드를 사용할 수 있으므로
 * cards1, cards2를 Queue로 두고 goal을 순차적으로 비교한다.
 *
 * goal의 각 단어에 대해:
 *   - 현재 cards1의 맨 앞 카드가 일치하면 poll()
 *   - 아니면 cards2의 맨 앞 카드가 일치하면 poll()
 *   - 두 큐 모두 매칭되지 않으면 만들 수 없는 배열이므로 "No" 반환
 *
 * 모든 goal 단어를 순서대로 사용할 수 있다면 "Yes" 반환.
 *
 */
public class P_159994_카드뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));

        for(String str : goal){
            if(!queue1.isEmpty() && queue1.peek().equals(str)){
                queue1.poll();
            } else if(!queue2.isEmpty() && queue2.peek().equals(str)){
                queue2.poll();
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
