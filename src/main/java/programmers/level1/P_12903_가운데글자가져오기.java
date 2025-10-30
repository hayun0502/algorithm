package programmers.level1;

/**
 * [Programmers - Level 1] 가운데 글자 가져오기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12903
 * 풀이 날짜: 2025.10.30
 * 사용 알고리즘: 문자열
 * 시간복잡도: O(1)
 *
 * 문자열 s의 길이가 홀수면 가운데 글자 1개, 짝수면 가운데 글자 2개를 반환한다.
 */
public class P_12903_가운데글자가져오기 {
    public String solution(String s) {
        int length = s.length();
        int mid = length / 2;

        if (length % 2 == 0) {
            return s.substring(mid - 1, mid + 1);
        } else {
            return s.substring(mid, mid + 1);
        }
    }
}
