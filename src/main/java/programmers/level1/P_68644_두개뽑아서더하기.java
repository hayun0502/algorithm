package programmers.level1;

import java.util.*;

/**
 * [Programmers - Level 1] 두 개 뽑아서 더하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/68644
 * 풀이 날짜: 2025.11.13
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n²)
 *
 * for문을 이용하여 다음 인덱스와의 합을 구한 후 중복제거를 위해 hashset에 담아준다.
 * 이를 int[]에 담은 후 오름차순으로 정렬하여 반환한다.
 */
public class P_68644_두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int idx = 0;
        for (int value : set) {
            answer[idx++] = value;
        }

        Arrays.sort(answer);
        return answer;
    }
}
