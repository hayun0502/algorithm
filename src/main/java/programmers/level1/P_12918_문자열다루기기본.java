package programmers.level1;

/**
 * [Programmers - Level 1] 문자열 다루기 기본
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12918
 * 풀이 날짜: 2025.11.06
 * 사용 알고리즘: Loop
 * 시간복잡도: O(n)
 *
 * 문자열 길이가 4 또는 6인지 먼저 검사한 뒤,
 * 각 문자가 숫자인지 Character.isDigit()으로 확인한다.
 * 하나라도 숫자가 아니면 false를 반환한다.
 *
 */
public class P_12918_문자열다루기기본 {
    public boolean solution(String s) {
        if (!(s.length() == 4 || s.length() == 6)) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
