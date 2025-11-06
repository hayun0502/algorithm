package programmers.level1;

import java.util.*;

/**
 * [Programmers - Level 1] 추억 점수
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/176963
 * 풀이 날짜: 2025.11.06
 * 사용 알고리즘: Loop
 * 시간복잡도: O(N + M)
 *
 * name과 yearning 배열을 이용해 인물 이름을 키로, 그리움 점수를 값으로 하는
 * HashMap을 구성한다. 이후 photo 배열을 순회하면서 각 사진 속 인물의 이름을 map에서 조회하고,
 * 존재하면 해당 점수를 합산한다. 존재하지 않을 경우 getOrDefault()를 이용해 0을 반환하도록 처리한다
 *
 */
public class P_176963_추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String person : photo[i]) {
                sum += map.getOrDefault(person, 0);
            }
            answer[i] = sum;
        }
        return answer;
    }
}
