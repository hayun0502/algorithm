package programmers.level1;

import java.util.HashMap;
import java.util.Map;

/**
 * [Programmers - Level 1] 두 정수 사이의 합
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12912
 * 풀이 날짜: 2025.11.20
 * 사용 알고리즘: 등차수열
 * 시간복잡도: O(1)
 *
 * 등차수열 공식을 이용하여 풀이한다
 * ( a + b ) * count / 2
 *
 */
public class P_12912_두정수사이의합 {
    public long solution(int a, int b) {
        long max = Math.max(a, b);
        long min = Math.min(a, b);

        long count = max - min + 1;
        return (min + max) * count / 2;
    }
}
