package programmers.level1;

/**
 * [Programmers - Level 1] 자릿수 더하기
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12931
 * 풀이 날짜: 2025.10.27
 * 사용 알고리즘: Math, Loop
 * 시간복잡도: O(d)  // d = 숫자의 자릿수 길이
 *
 * 정수 n의 각 자리 숫자를 모두 더한 값을 반환한다.
 * 예) n = 987 -> 9 + 8 + 7 = 24
 */
public class P_12931_자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        String number = String.valueOf(n);
        for(int i = 0; i < number.length(); i++){
            answer += number.charAt(i) - '0';
        }
        return answer;
    }
}
