package programmers.level1;

/**
 * [Programmers - Level 1] 약수의 개수와 덧셈
 * 문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/77884
 * 풀이 날짜: 2025.11.04
 * 사용 알고리즘: Loop, Math
 * 시간복잡도: O(n)
 *
 * 약수의 개수가 홀수인 경우는 완전제곱수라는 것을 이용하여 풀이
 */
public class P_77884_약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }
}
