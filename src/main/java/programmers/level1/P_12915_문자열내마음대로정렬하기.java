package programmers.level1;

import java.util.Arrays;

/**
 * [Programmers - Level 1] 문자열 내 마음대로 정렬하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12915
 * 풀이 날짜: 2025.11.13
 * 사용 알고리즘: Arrays.sort() + 람다식 Comparator
 * 시간복잡도: O(n)
 *
 * 문자열 배열을 n번째 문자를 기준으로 우선 정렬하고,
 * 해당 문자가 동일한 경우 전체 문자열 사전순으로 정렬하는 로직이다.
 * Arrays.sort()에 람다식 Comparator를 전달해 정렬 기준을 직접 정의했다.
 * a.charAt(n)과 b.charAt(n)을 비교해 1차 정렬을 수행하고,
 * 같을 경우 String.compareTo()를 사용해 기본 사전순 비교를 수행한다.
 *
 */
public class P_12915_문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if(a.charAt(n) == b.charAt(n)){
                return a.compareTo(b);
            }else{
                return Character.compare(a.charAt(n), b.charAt(n));
            }
        });
        return strings;
    }
}
