package programmers.level1;

/**
 * [Programmers - Level 1] 문자열을 정수로 바꾸기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12925
 * 풀이 날짜: 2025.10.29
 * 사용 알고리즘: Math, Loop
 * 시간복잡도: O(n)
 *
 * 문자열 s를 정수로 변환한다.
 * 예) "+1234" → 1234, "-1234" → -1234
 */
public class P_12925_문자열을정수로바꾸기 {
    public int solution(String s) {
        return Integer.parseInt(s);
    }
}
