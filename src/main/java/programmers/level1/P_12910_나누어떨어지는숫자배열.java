package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * [Programmers - Level 1] 나누어 떨어지는 숫자 배열
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * 풀이 날짜: 2025.11.18
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * 조건을 만족하는 원소만 담아야 하므로 동적 자료구조인 List를 사용한다.
 * arr의 각 원소가 divisor로 나누어떨어지면 리스트에 추가한다.
 * 리스트가 비어 있다면 나누어떨어지는 수가 없는 것이므로 [-1]을 바로 반환하고,
 * 값이 있다면 정렬 후 배열로 변환하여 반환한다.
 *
 */
public class P_12910_나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }

        if (list.isEmpty()) {
            return new int[]{ -1 };
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
