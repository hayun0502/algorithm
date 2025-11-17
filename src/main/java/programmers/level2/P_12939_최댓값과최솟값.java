package programmers.level2;

/**
 * [Programmers - Level 2] 최댓값과 최솟값
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12939
 * 풀이 날짜: 2025.11.17
 * 사용 알고리즘: Loop
 * 시간복잡도: O(N)
 *
 * String s를 공백기준으로 split 한다.
 * Integer.MAX_VALUE와 Integer.MIN_VALUE를 사용하여 초기값을 세팅한 후
 * 배열을 순회하면서 min, max 값을 반환한다.
 *
 */
public class P_12939_최댓값과최솟값 {
    public String solution(String s) {
        String[] values = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String value : values) {
            int n = Integer.parseInt(value);
            if (n < min) min = n;
            if (n > max) max = n;
        }

        return min + " " + max;
    }
}
