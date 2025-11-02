package programmers.level1;
import java.util.*;

/**
 * [Programmers - Level 1] 같은 숫자는 싫어
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * 풀이 날짜: 2025.11.02
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * for문을 이용하여 다음 인덱스와 일치하지 않을 경우에만 List add
 */
public class P_12906_같은숫자는싫어 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length - 1]);

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
