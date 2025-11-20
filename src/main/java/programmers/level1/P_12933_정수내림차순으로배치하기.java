package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * [Programmers - Level 1] 정수 내림차순으로 배치하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12933
 * 풀이 날짜: 2025.11.20
 * 사용 알고리즘:
 * 시간복잡도: O(d log d)  *자릿수
 *
 * long n을 앞에서부터 하나씩 정렬하기 위해 char[]로 선언
 * SringBuilder의 reverse()를 사용하여 문자열을 반전시킨 후,
 * 리턴타입을 맞추기 위해 parseLong 해준 후 반환한다.
 *
 */
public class P_12933_정수내림차순으로배치하기 {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();
        return Long.parseLong(sb.toString());
    }
}
