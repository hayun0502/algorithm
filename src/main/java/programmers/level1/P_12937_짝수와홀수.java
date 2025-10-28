package programmers.level1;

/**
 * [Programmers - Level 1] 짝수와 홀수
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/12937
 * 풀이 날짜: 2025.10.28
 * 사용 알고리즘: Math
 * 시간복잡도: O(1)
 *
 * 자연수 num를 2로 나눴을 때 나머지로 짝수 홀수 판별하기
 * 예) num = 3 -> "Odd"
 */
public class P_12937_짝수와홀수 {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
