package programmers.level1;

import java.util.Arrays;

/**
 * [Programmers - Level 1] 문자열 내림차순으로 배치하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12917
 * 풀이 날짜: 2025.11.05
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n log n)
 *
 * sort()를 이용하여 문자를 오름차순으로 정렬한 뒤,
 * StringBuilder의 reverse()를 활용해 내림차순으로 변환한다.
 * 대문자는 소문자보다 아스키 코드값이 작기 때문에 자동으로 소문자가 앞쪽(큰쪽)에 배치된다.
 */
public class P_12917_문자열내림차순으로배치하기 {
    public String solution(String s) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);

        return new StringBuilder(new String(ch)).reverse().toString();
    }
}
